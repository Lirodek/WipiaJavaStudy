package org.hollydayProject.game;

public class GameMethodGather {
	public void BubleStrime(GamerInfo[] gInfo,int curCnt) {//버블정렬
		int temp=99;
		for(int i=0;i<curCnt;i++) {
			for(int j=0;j<curCnt-1;j++) {
				if(gInfo[j].getAvg()<gInfo[j+1].getAvg()) {
					gInfo[temp]=gInfo[j];
					gInfo[j]=gInfo[j+1];
					gInfo[j+1]=gInfo[temp];
				}
					
			}
		}
		for(int i=0;i<curCnt;i++) {
			gInfo[i].setRank(i+1);
		}
	}
	
}
