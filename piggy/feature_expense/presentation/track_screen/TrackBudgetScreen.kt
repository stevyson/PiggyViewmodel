package com.example.piggy.feature_expense.presentation.track_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.piggy.feature_expense.presentation.budget_expense.BudgetExpenseScreen
import com.example.piggy.feature_expense.presentation.track_screen.components.BudgetMeter
import com.example.piggy.feature_expense.presentation.track_screen.components.TrackedExpense


@Composable
fun TrackBudgetScreen(

) {
   val totalBudget = 200f
    val  totalSpent = 100f

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        BudgetMeter(totalSpent = 100f, totalBudget = 200f, number =100)
        Spacer(modifier = Modifier.height(20.dp))
        Row(
           modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(text = "$ ${totalBudget - totalSpent}   remaining")

        }
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(1.dp)
        ){
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    TrackedExpense(title ="goat" , price = "1600")
                    TrackedExpense(title = "meat", price = "1220")

                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = " $ ${totalSpent}  spent")




    }

}





@Preview
@Composable
fun DefaultPreview() {

    Surface {
        TrackBudgetScreen()
    }
}

