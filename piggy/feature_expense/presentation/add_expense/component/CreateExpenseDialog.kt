package com.example.piggy.feature_expense.presentation.add_expense.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.piggy.feature_expense.presentation.add_expense.AddExpenseEvent
import com.example.piggy.feature_expense.presentation.add_expense.AddExpenseState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateExpenseDialog(
    state: AddExpenseState,
    onEvent: (AddExpenseEvent) -> Unit,
    modifier: Modifier = Modifier
) {
    AlertDialog(
        modifier = modifier,
        onDismissRequest = {
            onEvent(AddExpenseEvent.OnDoneCreateExpenseTag)
        },
        title = { Text(text = "Add Expense")},
        text = {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                TextField(
                    value = state.title,
                    onValueChange = {
                        onEvent(AddExpenseEvent.SetTitle(it))
                    },
                    placeholder = {
                        Text(text = "Title")
                    })
            }
        },
        confirmButton = {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd
            ) {
                Button(onClick = {
                    onEvent(AddExpenseEvent.OnDoneCreateExpenseTag)
                }) {
                    Text(text = "save")
                }
            }
        }
    )
}