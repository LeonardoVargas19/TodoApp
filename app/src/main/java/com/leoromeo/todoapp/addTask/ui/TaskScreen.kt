package com.leoromeo.todoapp.addTask.ui


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun TaskScreen(/*taskViewModel: TaskViewModel*/) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        FabDialog(Modifier.align(Alignment.BottomEnd))
    }
}

@Composable
private fun FabDialog(modifier: Modifier) {
    AddTaskDialog(true, {})
    FloatingActionButton(
        onClick = {
            //TODO LANZAR UN DIALOGO
        },
        modifier = modifier
            .padding(17.dp)
    ) {
        Icon(Icons.Filled.Add, "Floating action button.")
    }
}


@Composable
fun AddTaskDialog(show: Boolean, onDismiss: () -> Unit) {
    var myTask by rememberSaveable {
        mutableStateOf("")
    }
    if (show) {
        Dialog(
            onDismissRequest = { onDismiss() }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(17.dp)
            ) {
                Text(
                    text = "Añade tu tarea",
                    fontSize = 15.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    fontWeight = FontWeight.Bold

                )
                Spacer(modifier = Modifier.size(19.dp))
                TextField(
                    value = myTask, onValueChange = { myTask = it },
                    maxLines = 1,
                    singleLine = true
                )
                Spacer(modifier = Modifier.size(19.dp))
                Button(
                    onClick = {
                        // TODO MANDAR TAREA
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Añadir tarea")
                }
            }
        }
    }

}