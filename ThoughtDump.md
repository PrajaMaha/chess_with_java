# Requirements:

## Pieces:
 ### Pawn:
 ### Rook:
 ### Knight:
 ### Bishop:
 ### Queen:
 ### King:
## Timer
## Win Probablity
## Movement
 ### Individual Movement Logic (Valid Movement)
 ### Invalid Movement Logic
 ### Capture Movement Logic
 ### Affects to Win Probability
## Board:
 ### Master Log of all pieces
 ### To be able to conver to a GUI
## Computer Logic
 ### Maybe even Variable
## Score Card:
 ### Based on how many enemy pieces gathered
 ### To be able to conver to a GUI
## GUI
 ### Board
 ### Pieces Moving
 ### Score Change
 ### Timer
 ### Side Board for captured pieces
 ### Maybe even 180° board flip for 2p game
## Errors
## Testing






# Reasoning:

## How i will be implementing the pieces:
    - create a base abstract class pieces that handles the basic functions.
    - each piece class (pawn, rook, etc.) will implement specific implementation that will declare specific functions
    - within this abstract class there will be a abstract method `move`