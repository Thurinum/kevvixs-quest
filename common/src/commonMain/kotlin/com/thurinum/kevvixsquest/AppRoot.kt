package com.thurinum.kevvixsquest

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun AppRoot() {
	MaterialTheme {
		Surface(color = MaterialTheme.colors.background) {
			TopAppBar({
				Text("Theodore L'Heureux")
			})

			PlatformBased()
		}
	}
}
