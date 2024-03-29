/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.farshidabz.androidbaseapplication.source

import org.apache.tools.ant.Task


class FakeDataSource(var tasks: MutableList<Task>? = mutableListOf()) /*: TasksDataSource */{
//    override suspend fun getTasks(): Result<List<Task>> {
//        tasks?.let { return Success(it) }
//        return Error(
//            Exception("Tasks not found")
//        )
//    }
//
//    override suspend fun getTask(taskId: String): Result<Task> {
//        tasks?.firstOrNull { it.id == taskId }?.let { return Success(it) }
//        return Error(
//            Exception("Task not found")
//        )
//    }
//
//    override suspend fun saveTask(task: Task) {
//        tasks?.add(task)
//    }
//
//    override suspend fun completeTask(task: Task) {
//        tasks?.firstOrNull { it.id == task.id }?.let { it.isCompleted = true }
//    }
//
//    override suspend fun completeTask(taskId: String) {
//        tasks?.firstOrNull { it.id == taskId }?.let { it.isCompleted = true }
//    }
//
//    override suspend fun activateTask(task: Task) {
//        tasks?.firstOrNull { it.id == task.id }?.let { it.isCompleted = false }
//    }
//
//    override suspend fun activateTask(taskId: String) {
//        tasks?.firstOrNull { it.id == taskId }?.let { it.isCompleted = false }
//    }
//
//    override suspend fun clearCompletedTasks() {
//        tasks?.removeIf { it.isCompleted }
//    }
//
//    override suspend fun deleteAllTasks() {
//        tasks?.clear()
//    }
//
//    override suspend fun deleteTask(taskId: String) {
//        tasks?.removeIf { it.id == taskId }
//    }
}
