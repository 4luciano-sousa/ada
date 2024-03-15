package exercicios2;

public class Solution {

	    public static boolean eUmTriangulo(int[] input) {
	        if (input.length != 3)
	            return false;

	        if (input[0] + input[1] > input[2] &&
	                input[0] + input[2] > input[1] &&
	                input[1] + input[2] > input[0]) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    public static void main(String[] args) {
	        int[] lados1 = {1, 1, 1};
	        int[] lados2 = {1, 4, 5};

	        System.out.println("Os valores fornecidos formam um triângulo? " + eUmTriangulo(lados1));
	        System.out.println("Os valores fornecidos formam um triângulo? " + eUmTriangulo(lados2));
	    }
	}