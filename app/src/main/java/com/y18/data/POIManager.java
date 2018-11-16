package com.y18.data;

import android.content.Context;

import com.y18.util.TLog;

import java.io.IOException;
import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * Author: zyh
 * Date: 2018/11/14 8:43
 */
public enum POIManager {
    INSTANCE;

    private Context mContext;

    public void init(Context context) {
        this.mContext = context;
    }

    public void readXLS() {
        InputStream is = null;
        try {
            is = mContext.getAssets().open("pp89-60.xls");
            Workbook workbook = Workbook.getWorkbook(is);
            for(Sheet sheet:workbook.getSheets()){
                for(int i=0;i<sheet.getRows();i++){
                    for(Cell cell:sheet.getRow(i)){
                        TLog.INSTANCE.d("cell Content:"+cell.getContents());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (BiffException e){
            e.printStackTrace();
        }finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
