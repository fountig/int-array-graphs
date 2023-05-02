# java-primitive-graphs
Simple Graphs implemented in Java primitives. 

I'm not using any proper OO design here, nor Vectors or ArrayLists, just good plain 'ole int arrays.
In short, the graph methods manipulate a two-dimensional int array, which serves as the graph's adjucency matrix.
You can create a graph with a maximum of 26 vertices, which are labeled automatically from a to z.
This should be enough to make draw graphs using pen and paper, represent those graphs using the graph methods provided,
and try algorithmic experiments. 


Usage:

## Create a graph with 4 vertices. 

```Graph g1 = new Graph(4);```

## Print adjancency matrix

``` g1.printAdjMatrix();```

## Add an edge

```g1.addE('a','b');```

## Delete an edge

```g1.delE('a','b');```

## Test for edge existence

```g1.existsE('a','b');```

## Get vertex degree

```g1.degV('a');```

## Get edges

```g1.getE('a');```
