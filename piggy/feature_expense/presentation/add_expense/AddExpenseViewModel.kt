package com.example.piggy.feature_expense.presentation.add_expense

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.piggy.feature_expense.domain.repository.ExpenseRepository
import com.example.piggy.feature_expense.domain.use_case.expense_usecase.ExpenseUseCases
import com.example.piggy.feature_expense.domain.util.Routes
import com.example.piggy.feature_expense.domain.util.UiEvent
import com.example.piggy.feature_expense.presentation.add_expense.component.ExpenseTag
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

//i am trying to write the viewmodel for a selection screen in  an expense tracker app,
// remember i am using dependency injections,
// the selection screen is a flowrow of list of expense tag items
// and clicking on your expense tag of your choice,
// and clicking okay should take you to another screen,the budget expense screen.
// You should also be able to create a custom expense tag of your choice
// and it will be added to the selection screen.


@HiltViewModel
class AddExpenseViewModel @Inject constructor(
    private val repository: ExpenseRepository,
    savedStateHandle: SavedStateHandle,
    private val useCases: ExpenseUseCases,
): ViewModel() {


    private val _selectedExpenseTag = MutableLiveData<ExpenseTag>()
    val selectedExpenseTag: LiveData<ExpenseTag>
        get() = _selectedExpenseTag

    private val _state = MutableStateFlow(AddExpenseState())
    val state: MutableStateFlow<AddExpenseState> = _state

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()


    fun onEvent(event: AddExpenseEvent){
        when(event){
            is AddExpenseEvent.OnExpenseTagSelected -> {
                viewModelScope.launch {
                    if (_state.value.isSelected){
                        _state.value = AddExpenseState(
                            isSelected = false
                        )
                    }
                    _state.value = AddExpenseState(
                        isSelected = true
                    )
                    _selectedExpenseTag.value = expenseTag

                }
            }

            AddExpenseEvent.OnCreateExpenseTag -> {
                _state.update { it.copy(
                    isCreatingExpense = true
                )}
                sendUiEvent(UiEvent.Navigate(Routes.CREATE_EXPENSE_DIALOG))
            }

            AddExpenseEvent.OnDoneSelected -> TODO()

            is AddExpenseEvent.SetTitle -> {
                _state.update { it.copy(
                    title = event.title
                )}
            }

            AddExpenseEvent.OnDoneCreateExpenseTag -> {

            }


        }


    }


    private fun sendUiEvent(event: UiEvent) {
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }
}





