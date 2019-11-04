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
package com.farshidabz.androidbaseapplication.taskdetail

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.runner.RunWith

/**
 * Integration test for the Task Details screen.
 */
@MediumTest
@RunWith(AndroidJUnit4::class)
@ExperimentalCoroutinesApi
class TaskDetailFragmentTest {

//    private lateinit var repository: TasksRepository
//
//    @Before
//    fun initRepository() {
//        repository = FakeRepository()
//        ServiceLocator.tasksRepository = repository
//    }
//
//    @After
//    fun cleanupDb() = runBlockingTest {
//        ServiceLocator.resetRepository()
//    }
//
//    @Test
//    fun activeTaskDetails_DisplayedInUi() {
//        // GIVEN - Add active (incomplete) task to the DB
//        val activeTask = Task("Active Task", "AndroidX Rocks", false)
//        repository.saveTaskBlocking(activeTask)
//
//        // WHEN - Details fragment launched to display task
//        val bundle = TaskDetailFragmentArgs(activeTask.id).toBundle()
//        launchFragmentInContainer<TaskDetailFragment>(bundle, R.style.AppTheme)
//
//        // THEN - Task details are displayed on the screen
//        // make sure that the title/description are both shown and correct
//        onView(withId(R.id.task_detail_title_text)).check(matches(isDisplayed()))
//        onView(withId(R.id.task_detail_title_text)).check(matches(withText("Active Task")))
//        onView(withId(R.id.task_detail_description_text)).check(matches(isDisplayed()))
//        onView(withId(R.id.task_detail_description_text)).check(matches(withText("AndroidX Rocks")))
//        // and make sure the "active" checkbox is shown unchecked
//        onView(withId(R.id.task_detail_complete_checkbox)).check(matches(isDisplayed()))
//        onView(withId(R.id.task_detail_complete_checkbox)).check(matches(not(isChecked())))
//    }
//
//    @Test
//    fun completedTaskDetails_DisplayedInUi() {
//        // GIVEN - Add completed task to the DB
//        val completedTask = Task("Completed Task", "AndroidX Rocks", true)
//        repository.saveTaskBlocking(completedTask)
//
//        // WHEN - Details fragment launched to display task
//        val bundle = TaskDetailFragmentArgs(completedTask.id).toBundle()
//        launchFragmentInContainer<TaskDetailFragment>(bundle, R.style.AppTheme)
//
//        // THEN - Task details are displayed on the screen
//        // make sure that the title/description are both shown and correct
//        onView(withId(R.id.task_detail_title_text)).check(matches(isDisplayed()))
//        onView(withId(R.id.task_detail_title_text)).check(matches(withText("Completed Task")))
//        onView(withId(R.id.task_detail_description_text)).check(matches(isDisplayed()))
//        onView(withId(R.id.task_detail_description_text)).check(matches(withText("AndroidX Rocks")))
//        // and make sure the "active" checkbox is shown unchecked
//        onView(withId(R.id.task_detail_complete_checkbox)).check(matches(isDisplayed()))
//        onView(withId(R.id.task_detail_complete_checkbox)).check(matches(isChecked()))
//    }
}
