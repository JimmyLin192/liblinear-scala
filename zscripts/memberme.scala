object MemberMe extends ScalaZombie {
    def main(args: Array[String]): Unit = {
ZOMBIE("Zombie1")
SUMMON
    REMEMBER(1)
BIND

ZOMBIE("Zombie2")
SUMMON
    REMEMBER(1)
BIND

ZOMBIE("FibonacciZombie")
SUMMON
    REMEMBER(0)
    TASK("SayFibonaccis")
        SHAMBLE
            SAY(MOAN("FibonacciZombie"))
            SAY(MOAN("Zombie1"))
            SAY(MOAN("Zombie2"))
            REMEMBER("Zombie1", (MOAN("Zombie1") + MOAN("Zombie2")))
            REMEMBER("Zombie2", (MOAN("Zombie1") + MOAN("Zombie2")))
            // REMEMBER(MOAN("Zombie1") + MOAN("Zombie2"))
            REMEMBER(MOAN() + 2)
        UNTIL(REMEMBERING(100))
    ANIMATE
ANIMATE
    }
}
