package dpAdapter.ext;

import dpAdapter.Implementation.Standard;

public class AdapterComposition implements Standard {
    private ImplementationAdapter adapter=new ImplementationAdapter();
    @Override
    public void operation(int nb1, int nb2) {
        int res=adapter.operation2(nb1, nb2);
        adapter.operation3(res);
    }
}
