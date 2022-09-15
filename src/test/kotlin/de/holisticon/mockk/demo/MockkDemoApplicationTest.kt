package de.holisticon.mockk.demo

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test


class MockkDemoApplicationTest {

    @Test
    fun `do something with mockk`() {
        val mockkDemoApplication = mockk<MockkDemoApplication>()

        every { mockkDemoApplication.toString() } returns "foo"

        mockkDemoApplication.toString()

        verify { mockkDemoApplication.toString() }
    }
}