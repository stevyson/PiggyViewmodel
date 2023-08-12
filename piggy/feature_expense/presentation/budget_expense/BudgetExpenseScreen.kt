package com.example.piggy.feature_expense.presentation.budget_expense

import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.*
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.piggy.ui.theme.Zoffany


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BudgetExpenseScreen(){

    Scaffold(
        floatingActionButton ={
            FloatingActionButton(containerColor = Zoffany,
                onClick = {
                null
            }) {
                Icon(imageVector = Icons.Default.Check,
                    contentDescription = "save",
                modifier = Modifier.background(Zoffany))
            }
        }
    ) {
         Column(
             modifier = Modifier
                 .fillMaxSize()
                 .padding(it),
             verticalArrangement = Arrangement.Top
         ) {
             Card(
                 modifier = Modifier
                     .fillMaxWidth()
                     ,
                 shape= RectangleShape,
                 elevation = CardDefaults.cardElevation(2.dp),
                 colors = CardDefaults.cardColors(
                     containerColor = Zoffany
                 )


             ) {
                 Column(
                     modifier = Modifier
                         .fillMaxWidth()
                         .background(Zoffany),
                     verticalArrangement = Arrangement.Center,
                     horizontalAlignment = Alignment.CenterHorizontally
                 ) {
                     Text(text = "Total Budget", fontSize = 40.sp, fontStyle = FontStyle.Italic)

                 }
                 Row(
                     modifier = Modifier
                         .padding(8.dp)
                         .background(Zoffany),
                 ) {
                     Spacer(modifier = Modifier
                         .width(30.dp)
                         .background(Zoffany))
                     Text(text = "$", fontSize = 60.sp, fontWeight = FontWeight.Bold)
                     Spacer(modifier = Modifier.width(40.dp))
                     Text(text = "150050", fontSize = 60.sp, fontWeight = FontWeight.Bold)
                 }
             }
             Column(

             ) {
                 Spacer(modifier = Modifier.height(70.dp))
                 Text(text = "Expected Expense",
                     fontSize = 30.sp,
                     fontWeight = FontWeight.Normal)
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

                             Text(text = "Fuel", fontSize = 18.sp)
                             Spacer(modifier = Modifier.width(30.dp))
                             Text(text = "$ 8992", fontSize = 18.sp)
                             Spacer(modifier = Modifier.width(230.dp))
                             Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit" )


                         }
                     }
                 }
                 
             }
         }

    }

}



