inOrder(X,Y,Z) :- X < Y, Z > Y,true;
                X >Y, Y > Z,true.
