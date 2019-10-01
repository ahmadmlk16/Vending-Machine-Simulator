# Vending-Machine-Simulator
/*
        Algorithm:
        1. This program simulates a vending machine.
        2. Display items, their serial numbers and their corresponding prices.
        3. Ask User to enter money in acceptable money amounts i.e 1,5 dollar or 1,5,10,25 cents.
        4. While money entered is not 0 accept money from user and save to balance.
        5. If user enters anything other then acceptable money amounts print error message.
           Else save money entered to balance and display balance.
        6. When user enters zero terminate while loop and save to balance.
        7. If balance entered by user is 0 then display message and end program.
           Else continue with program.
        8. declare items and their corresponding prices as doubles.
        9. Ask user to enter serial numbers of items to dispense.
        10. Run a For loop to allow user to dispense 5 items maximum per transaction.
        11. If user enters valid serial number and has enough balance dispense item.
            Else if user enters 0. Break loop.
            Else if user enters invalid serial number display error message.
        12. Display balance remaining.
        13. If balance remaining is more then 0 calculate change in .25, .10 , .05 ,.01
            Else Display last message and terminate program.
        14. Display end message and terminate program.

         */
