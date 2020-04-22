import org.junit.Assert.assertTrue
import org.junit.Test

class ProjectTests {
    @Test
    fun buildsHaveCleanCheckOut() {
        val project = ExampleProject

        project.buildTypes.forEach { bt ->
            assertTrue("BuildType '${bt.id}' doesn't use clean checkout", bt.vcs.cleanCheckout)
        }
    }
}