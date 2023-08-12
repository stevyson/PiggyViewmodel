package com.example.piggy.feature_expense.presentation.add_expense.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.piggy.feature_expense.domain.model.Expense

data class ExpenseTag(val title: String, val price: Double)

@Composable
fun ExpenseTag(
    expenseTag: ExpenseTag,
    isSelected: Boolean,
    onItemClick: (ExpenseTag) -> Unit
) {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(100.dp)
            )
            .padding(10.dp)
            .clickable { onItemClick(expenseTag) }
            .background(if (isSelected) Color.LightGray else Color.White)

    ) {
        Text(
            text = expenseTag.title,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium
        )

    }
}

