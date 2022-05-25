// Breath-First Search(BFS)

//----------------------------------------------------------------

// One of the full graph search methods

// Start form the start node and search
// by visiting the nearest node first.

//---------------------------------------------------------------

// Implemented as a queue in a first-in-first-out method

// Time comlexity: number of nodes + number of edges

// Guaranteed shortest path when multiple paths arrive
// at the target node

//---------------------------------------------------------------

// 1. Determine the node to start and initialize 
// the data structure to be used (array required)
// Origianl Graph => Adjacency List => Visited Array
// => Add the starting point to the queue data structure

// 2. Dequeue a node from the queue and insert
// the node adjacent to the removed node back into the queue.
// => Adjacency list => enqueue the target node's neighbor
// => Check the visit array by inserting a node

// 3. Repeat until there is no value in the queue data structure
