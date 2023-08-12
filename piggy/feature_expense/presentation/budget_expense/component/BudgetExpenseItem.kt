package com.example.piggy.feature_expense.presentation.budget_expense.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BudgetExpenseItem(){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {

        Text(text = "Fuel", fontSize = 18.sp)
        Spacer(modifier = Modifier.width(30.dp))
        Text(text = "$ 8992", fontSize = 18.sp)
        Spacer(modifier = Modifier.width(230.dp))
        Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit" )



    }

}

