object HelloWorldAnimateTask extends ScalaZombie {
    def main (args: Array[String]): Unit = {
ZOMBIE("HelloWorld")
SUMMON
    SAY("Hellow without a task")
    TASK("SayHello")
        SAY("Hello World!")
    ANIMATE
    TASK("SayHelloAgain")
        SAY("Hellow Again World!")
    ANIMATE
ANIMATE
    }
}
