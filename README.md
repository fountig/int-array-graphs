# java-primitive-graphs
Simple Graphs implemented in Java primitives. 

I'm not using any proper OO design here, nor Vectors or ArrayLists, just good plain 'ole int arrays.
In short, the operations act on a two-dimensional int array, which serves as the graph's adjucency matrix.
You can create a graph with a maximum of 26 vertices, which are labeled automatically from a to z.
It's simple, fast, and you can easily use pencil and paper and do algorithmic experiments.

Example:

## Create a graph with 4 vertices. 

```Graph g1 = new Graph(4);```

## Print adjancency matrix

```g1.printAdjMatrix();

  abcd
a 0000
b 0000
c 0000
d 0000
```
