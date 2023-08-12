package com.example.piggy.feature_expense.presentation.budget_expense.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BudgetExpenseTotal(){

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        shape = RoundedCornerShape(CornerSize(10.dp)),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Total Budget", fontSize = 40.sp)

        }
        Row(
            modifier = Modifier.padding(8.dp),
        ) {
            Spacer(modifier = Modifier.width(30.dp))
            Text(text = "$", fontSize = 60.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(40.dp))
            Text(text = "150050", fontSize = 60.sp, fontWeight = FontWeight.Bold)
        }


    }

}

