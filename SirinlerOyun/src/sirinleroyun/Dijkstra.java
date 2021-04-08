
package sirinleroyun;

import java.awt.Graphics;
import java.util.List;
/**
 *
 * @author Gökçe Yılmaz
 */
public class Dijkstra {
//   private static final int NO_PARENT = -1;
//   
//   public static void dijkstra (int[][] adjacencyMatrix, int startVertex, int endVertex,List<Integer> shortWay){
//   
//   int nVertices = adjacencyMatrix[0].length;
//   
//   int[] shortestDistance = new int[nVertices];
//   
//   boolean[] added = new boolean[nVertices];
//   
//   for(int vertexIndex = 0; vertexIndex < nVertices; vertexIndex){
//     
//       shortestDistances[vertexIndex] = Integer.MAX_VALUE;
//       added[vertexIndex] =false;
//   }
//   
//   shortestDistance[startVertex] = 0;
//   
//   int[] parents = new int[nVertices];
//   
//   parents[startVertex] = NO_PARENT;
//   
//   for(int i=1 ; i<nVertices ; i++){
//       
//       int nearestVertex = -1;
//       int shortestDistance = Integer.MAX_VALUE;
//       for(int vertexIndex = 0; vertexIndex<nVertices ; vertexIndex++){
//           if(!added[vertexIndex] && shortesDistances[vertexIndex]<shortestDistance){
//               nearestVertex = vertexIndex;
//               shortestDistance = shortestDistances[vertexIndex];
//           }
//           }
//       
//       added[nearestVertex] = true;
//       
//       for(int vertexIndex = 0 ; vertexIndex<nVertices ; vertexIndex++){
//           int edgeDistance = adjancencyMatrix[nearestVertex][vertexIndex];
//           if(edgeDistance>0 && ((shortestDistance + edgeDistance)<shortestDistances[vertexxIndex])){
//               parents[vertexIndex] = nearestVertex;
//               shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
//           }
//       }
//       }
//   
//        System.out.println(shortestDistances[endVertex]);
//               printPath(endVertex,parents,shortWay);
//   }
//   
//   private static void printPath(int currentVertex, int[] parents, List<Integer> shortWay){
//   
//       if(currentVertex == NO_PARENT){
//       return;
//       }
//       printPath(parents[currentVertex],parents,shortWay);
//       System.out.print(currentVertex +" ");
//       shortWay.add(currentVertex);
//   }
   }

