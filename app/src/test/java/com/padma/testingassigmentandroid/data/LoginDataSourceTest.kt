package com.padma.testingassigmentandroid.data

import com.padma.testingassigmentandroid.data.model.LoggedInUser
import org.junit.Assert
import org.junit.Test

class LoginDataSourceTest{
    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, 2 + 2)
    }

    /**
     * Test case for string.
     * test the input email pattern is correct type of email (Check the pattern).
     */
    @Test
    fun email_pattern_isCorrect() {
        val loginDataSource = LoginDataSource();
        val result = loginDataSource.isValidEmailPattern("padmaisuru@gmail.com")
        Assert.assertTrue(result);
    }


    /**
     * Test additionOfTwoNumbers function in "src/main/java/com/padma/testingassigmentandroid/data/LoginDataSource.kt"
     * Test case scenario.
     *      Test addition of two positive numbers.
     *      Test addition of two negative numbers.
     *      Test addition of positive number with negative number.
     *      Test addition of negative number with positive number.
     *      Test addition of positive number with zero.
     *      Test addition of negative number with zero.
     *
     */

    @Test
    fun addition_of_two_positive_numbers_isCorrect() {
        val loginDataSource = LoginDataSource()
        val expected = 5
        val result:Int = loginDataSource.additionOfTwoNumbers(2,3)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun addition_of_two_negative_numbers_isCorrect() {
        val loginDataSource = LoginDataSource()
        val expected = -5
        val result:Int = loginDataSource.additionOfTwoNumbers(-2,-3)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun addition_of_positive_number_with_negative_isCorrect() {
        val loginDataSource = LoginDataSource()
        val expected = -1
        val result:Int = loginDataSource.additionOfTwoNumbers(2,-3)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun addition_of_negative_number_with_positive_number_isCorrect() {
        val loginDataSource = LoginDataSource()
        val expected = 1
        val result:Int = loginDataSource.additionOfTwoNumbers(-2,3)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun addition_of_positive_number_with_zero_isCorrect() {
        val loginDataSource = LoginDataSource()
        val expected = 2
        val result:Int = loginDataSource.additionOfTwoNumbers(2,0)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun addition_of_negative_number_with_zero_isCorrect() {
        val loginDataSource = LoginDataSource()
        val expected = -2
        val result:Int = loginDataSource.additionOfTwoNumbers(-2,0)
        Assert.assertEquals(expected, result)
    }


    /**
     * Test case for object testing.
     */
    @Test
    fun user_isCorrect() {
        val demoUser = LoggedInUser("dummyUserId", "dummyUserName")
        Assert.assertNotNull(demoUser)
        Assert.assertEquals("dummyUserId",demoUser.userId)
        Assert.assertEquals("dummyUserName",demoUser.displayName)
    }
}