Feature: Is it divisible number?
   Checking some numbers whether they are divisible by concrete factors

   Scenario Outline: Number is disible by three, five or three and five
      Given checking number is <number>
      When checking whether the following number is divisible by concrete factors
      Then I should receive <answer>
      Examples:
        | number | answer |
        | 3 | "Fizz" |
        | 5 | "Buzz" |
        | 8 | "None" |
        | 15 | "FizzBuzz" |
        | 21 | "Fizz" |
        | 30 | "FizzBuzz" |
        | 40 | "Buzz" |
        | 45 | "FizzBuzz" |
        | 50 | "Buzz" |