Zombie1 is a zombie
summon
    remember 1
bind

Zombie2 is a zombie
summon
    remember 1
bind

FibonacciZombie is a zombie
summon
    remember 0
    task SayFibonaccis
        shamble
            say moan Zombie1
            say moan Zombie2
            remember Zombie1 moan Zombie1 moan Zombie2
            remember Zombie2 moan Zombie1 moan Zombie2
            remember moan 2
        until remembering 100
    animate
animate
