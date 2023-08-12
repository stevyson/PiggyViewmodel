package com.example.piggy.feature_expense.presentation.track_screen.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.piggy.feature_expense.presentation.track_screen.TrackBudgetScreen

@Composable
fun TrackedExpense(
    title: String,
    price: String
){
   Row(
       verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.Center,
       modifier = Modifier.wrapContentSize(Alignment.Center).padding(8.dp)
   ) {
       Box(
           modifier = Modifier
               .border(
                   width = 1.dp,
                   color = MaterialTheme.colorScheme.primary,
                   shape = RoundedCornerShape(100.dp)
               )
               .padding(10.dp)
       ) {
           Text(
               text = title,
               color = MaterialTheme.colorScheme.primary,
               textAlign = TextAlign.Center,
               style = MaterialTheme.typography.bodyMedium
           )
       }
       Spacer(modifier = Modifier.width(20.dp))
       Text(
           text = price,
           color = MaterialTheme.colorScheme.primary,
           textAlign = TextAlign.Center,
           style = MaterialTheme.typography.bodyMedium
       )

   }
}


