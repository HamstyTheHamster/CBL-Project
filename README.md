BACKLOG
Parici Vlad, Andrei Luca
Group 63

Topics of choice: 
version control (git/hg)
game design
time system

Main idea: COD Zombies 2D
The player faces an onslaught of zombies advancing along four separate lanes. They can move horizontally to switch between lanes and defend against the approaching horde. By positioning themselves in a lane, the player can fire bullets to eliminate zombies in that path. In addition to shooting the player may deploy barricades or other gadgets.
NAME: Render arena
HOW TO DEMO: Run the game. Window with arena should show up.
NOTES: Will have a class with a panel with walls colored white. Will represent a xOy system on which objects occupy space and move.

NAME: entity
HOW TO DEMO: check player entity
NOTE: to be made

NAME: Hit
HOW TO DEMO: if projectile coincides with target location event should trigger
NOTE: needs collision detection, entity object and sprite

NAME: player
HOW TO DEMO: check player entity
NOTE: extends on entity. May be controlled with AD and SPACE

NAME: zombie
HOW TO DEMO: check for apparition and movement of entity
NOTE: uses entity. Also needs movement and collision

NAME: bullet
HOW TO DEMO: shoot to see entity with space
NOTE: uses collision, hit and movement

NAME: movement
HOW TO DEMO: check for entity displacement
NOTE: to be made

NAME: input
HOW TO DEMO: press SPACE or AD
NOTE: to be made with keylistener

NAME: panel
HOW TO DEMO: run main
NOTE: to be made

NAME: timer (from swing)/thread
HOW TO DEMO: run program wait for zombie movement
NOTE: to be made 
