package com.minimaltools.commons.interfaces;

import com.minimaltools.commons.adapters.CustomRecyclerViewAdapter;

public interface ItemTouchHelperContract {

    void onRowMoved(int fromPosition, int toPosition);

    void onRowSelected(CustomRecyclerViewAdapter.ViewHolder myViewHolder);

    void onRowClear(CustomRecyclerViewAdapter.ViewHolder myViewHolder);
}
