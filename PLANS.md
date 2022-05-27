# Network Mechanics
*Need to be tested*
- Each copper block has a capacity of *c* units, and different varieties have different thresholds of *t* units
- When a block's amount of energy changes, it checks adjacent blocks. 
  If the difference between any two blocks is greater than the threshold, energy is transferred 
  from the one with more to the one with less. Energy corresponding to the size of the threshold is lost during transfer.