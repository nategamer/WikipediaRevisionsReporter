# Project Report

Nathan Swarts

## Challenge #1 Complete

For challenge 1, all I did was change the binding in the revision module, from FakeQueryEngine to WikipediaQueryEngine

## Challenge #2 Complete

I created, 
  * RevisionInterface which both RevisionFormatter and RevisionFormatter2 implement.
  * RevisionFormatter2, where I included the code to change the wording and separate the timestamp into a date and time variable so that the sentence would flow smoother.
  * RevisionModule, where I bound RevisionInterface to RevisionFormatter2

I added the inject statement for the RevisionInterface into WikipediaAnalyzer, removed the RevisionFormatter declaration. Since I called the injection formatter I didnt need to change the line where format is called in the for loop

## Challenge #3 Complete

I took the response.revisions and turned that into a stream, where I then mapped that stream to the format function from formatter injection, and then used a collector to turn it into a string where each item was delimited by a newline character.

## Reflection Question #1: Functional vs OO

I think both ways of concatenating a string are very viable, but doing it all in one line definetely feels better. I think using a for-loop is kind of like the go to beginner way of doing it and chaining functions is a more professional way of doing it. I usually prefer chaining functions when I can but the main problem with that is I might lose track of what data type is being passed to where.  

## Reflection Question #2: Polymorphism and Dependency Inversion

I think in challenge 2 and 3 was where polymorphism showed the most. Since the tasks were literally just finding another way to do it. But the dependency inversion is in challenge 2, before the challenge is completed, the higher level class WikipediaAnalyzer is reliant on the smaller class RevisionFormatter.  

