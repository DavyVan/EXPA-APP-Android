package org.aiesec.experience.expa;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchOpportunityFragment extends Fragment {
    private View view;


    public SearchOpportunityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_search_opportunity, container, false);

        SearchView searchView = (SearchView) view.findViewById(R.id.searchView);
        searchView.setIconifiedByDefault(true);
        searchView.onActionViewExpanded();
        searchView.clearFocus();

        ListView listView = (ListView) view.findViewById(R.id.searchOpportunityListView);
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), getData(), R.layout.search_opportunity_listview_item,
                new String[]{"title", "location"},
                new int[]{R.id.projectTitleTextView, R.id.projectLocationTextView});
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), OpportunityInfoActivity.class);
                Bundle bundle = new Bundle();
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        getActivity().setTitle("Search Opportunities");

        return view;
    }

    private List<Map<String, String>> getData()
    {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("title", "Dare to Dream");
        map.put("location", "Kuala Lumpur, Malaysia");
        list.add(map);

        map = new HashMap<>();
        map.put("title", "Project 2");
        map.put("location", "Beijing");
        list.add(map);

        return list;
    }


}
