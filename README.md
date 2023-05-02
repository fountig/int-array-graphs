# java-primitive-graphs
Simple Graphs implemented in Java primitives. 

I'm not using any proper OO design here, nor Vectors or ArrayLists, just good plain 'ole int arrays.
In short, the graph methods manipulate a two-dimensional int array, which serves as the graph's adjucency matrix.
You can create a graph with a maximum of 26 vertices, which are labeled automatically from a to z.
This should be enough to make draw graphs using pen and paper, represent those graphs using the graph methods provided,
and try algorithmic experiments. 


Usage:

## Create a graph with 4 vertices (constructor)

```Graph g1 = new Graph(int numberOfVertexes);```

## Print adjancency matrix (void)

``` g1.printAdjMatrix();```

## Add an edge (void)

```g1.addE(char v1, char v2);```

## Delete an edge (void)

```g1.delE(char v1,char v2);```

## Test for edge existence (boolean)

```g1.existsE(char v1,char v2);```

## Get vertex degree (int)

```g1.degV(char v1);```

## Get edges (char[])

```g1.getE(char v1);```
