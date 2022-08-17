# Back-End Knitting Patterns Made Easy

<a href="https://github.com/emilysaeli/back-end-knitting-patterns/blob/main/kpme/assets/UML.png">UML document</a>

![UML document](https://github.com/emilysaeli/back-end-knitting-patterns/blob/main/kpme/assets/UML.png "UML Document")


### ReturnPattern.java:  
createPattern()  
  -Splits pattern into array based on newline chars  
  -Loops through each line, generating stitchBlocks and rows of stitches  
  -Checks for uneven row lengths and generates empty stitches if needed  
  -Generates BO and CO rows  
  -Returns outputPattern to controller  

### Row.java:  
generateOneRowOfStitches():  
  -Loops through an ArrayList of stitchBlocks, generating stitches based on stitchBlock counts 
  
checkForRange():  
  -Checks line for int-int pattern and calculates number of additional rows needed  

### Stitch.java:  
generateStitches():  
  -Generates stitches based on stitchBlock count  

### StitchBlock.java:  
generateStitchBlocks():  
  -Searches string for knit/purl patterns and creates appropriate stitchBlocks   
  
generateCastOnRow():  
  -Generates row of CO stitches based on length of one row in pattern  
  
generateBingOffRow():  
  -Generates row of BO stitches based on length of one row in pattern  
  
generateEmptyStitches():  
  -Generates additional empty stitches based on extraStitches int  
  -Adds stitches to row and returns  
