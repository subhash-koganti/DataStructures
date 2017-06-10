package com.subhash.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BTreePrinter {

    public static void printBtreeNode(BtreeNode root) {
        int maxLevel = BTreePrinter.maxLevel(root);

        printBtreeNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static void printBtreeNodeInternal(List<BtreeNode> BtreeNodes, int level, int maxLevel) {
        if (BtreeNodes.isEmpty() || BTreePrinter.isAllElementsNull(BtreeNodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BTreePrinter.printWhitespaces(firstSpaces);

        List<BtreeNode> newBtreeNodes = new ArrayList<BtreeNode>();
        for (BtreeNode BtreeNode : BtreeNodes) {
            if (BtreeNode != null) {
                System.out.print(BtreeNode.data);
                newBtreeNodes.add(BtreeNode.left);
                newBtreeNodes.add(BtreeNode.right);
            } else {
                newBtreeNodes.add(null);
                newBtreeNodes.add(null);
                System.out.print(" ");
            }

            BTreePrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < BtreeNodes.size(); j++) {
                BTreePrinter.printWhitespaces(firstSpaces - i);
                if (BtreeNodes.get(j) == null) {
                    BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (BtreeNodes.get(j).left != null)
                    System.out.print("/");
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(i + i - 1);

                if (BtreeNodes.get(j).right != null)
                    System.out.print("\\");
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printBtreeNodeInternal(newBtreeNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static <T extends Comparable<?>> int maxLevel(BtreeNode BtreeNode) {
        if (BtreeNode == null)
            return 0;

        return Math.max(BTreePrinter.maxLevel(BtreeNode.left), BTreePrinter.maxLevel(BtreeNode.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}