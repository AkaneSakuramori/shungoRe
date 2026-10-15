package u;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f4575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f4576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f4577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f4578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f4579f;

    public i() {
        l lVar = new l();
        lVar.f4632a = 0;
        lVar.f4633b = 0;
        lVar.f4634c = 1.0f;
        lVar.f4635d = Float.NaN;
        this.f4575b = lVar;
        k kVar = new k();
        kVar.f4623a = -1;
        kVar.f4624b = 0;
        kVar.f4625c = -1;
        kVar.f4626d = Float.NaN;
        kVar.f4627e = Float.NaN;
        kVar.f4628f = Float.NaN;
        kVar.f4629g = -1;
        kVar.f4630h = null;
        kVar.f4631i = -1;
        this.f4576c = kVar;
        j jVar = new j();
        jVar.f4581a = false;
        jVar.f4587d = -1;
        jVar.f4589e = -1;
        jVar.f4591f = -1.0f;
        jVar.f4593g = true;
        jVar.f4595h = -1;
        jVar.f4597i = -1;
        jVar.f4599j = -1;
        jVar.f4601k = -1;
        jVar.f4603l = -1;
        jVar.f4605m = -1;
        jVar.f4607n = -1;
        jVar.f4609o = -1;
        jVar.f4611p = -1;
        jVar.f4612q = -1;
        jVar.f4613r = -1;
        jVar.f4614s = -1;
        jVar.f4615t = -1;
        jVar.f4616u = -1;
        jVar.f4617v = -1;
        jVar.f4618w = 0.5f;
        jVar.f4619x = 0.5f;
        jVar.f4620y = null;
        jVar.f4621z = -1;
        jVar.A = 0;
        jVar.B = 0.0f;
        jVar.C = -1;
        jVar.D = -1;
        jVar.E = -1;
        jVar.F = 0;
        jVar.G = 0;
        jVar.H = 0;
        jVar.I = 0;
        jVar.J = 0;
        jVar.K = 0;
        jVar.L = 0;
        jVar.M = Integer.MIN_VALUE;
        jVar.N = Integer.MIN_VALUE;
        jVar.O = Integer.MIN_VALUE;
        jVar.P = Integer.MIN_VALUE;
        jVar.Q = Integer.MIN_VALUE;
        jVar.R = Integer.MIN_VALUE;
        jVar.S = Integer.MIN_VALUE;
        jVar.T = -1.0f;
        jVar.U = -1.0f;
        jVar.V = 0;
        jVar.W = 0;
        jVar.X = 0;
        jVar.Y = 0;
        jVar.Z = 0;
        jVar.f4582a0 = 0;
        jVar.f4584b0 = 0;
        jVar.f4586c0 = 0;
        jVar.f4588d0 = 1.0f;
        jVar.f4590e0 = 1.0f;
        jVar.f4592f0 = -1;
        jVar.f4594g0 = 0;
        jVar.f4596h0 = -1;
        jVar.f4604l0 = false;
        jVar.f4606m0 = false;
        jVar.f4608n0 = true;
        jVar.f4610o0 = 0;
        this.f4577d = jVar;
        m mVar = new m();
        mVar.f4637a = 0.0f;
        mVar.f4638b = 0.0f;
        mVar.f4639c = 0.0f;
        mVar.f4640d = 1.0f;
        mVar.f4641e = 1.0f;
        mVar.f4642f = Float.NaN;
        mVar.f4643g = Float.NaN;
        mVar.f4644h = -1;
        mVar.f4645i = 0.0f;
        mVar.f4646j = 0.0f;
        mVar.f4647k = 0.0f;
        mVar.f4648l = false;
        mVar.f4649m = 0.0f;
        this.f4578e = mVar;
        this.f4579f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.f4577d;
        eVar.f4521e = jVar.f4595h;
        eVar.f4523f = jVar.f4597i;
        eVar.f4525g = jVar.f4599j;
        eVar.f4527h = jVar.f4601k;
        eVar.f4529i = jVar.f4603l;
        eVar.f4531j = jVar.f4605m;
        eVar.f4533k = jVar.f4607n;
        eVar.f4535l = jVar.f4609o;
        eVar.f4537m = jVar.f4611p;
        eVar.f4539n = jVar.f4612q;
        eVar.f4541o = jVar.f4613r;
        eVar.f4547s = jVar.f4614s;
        eVar.f4548t = jVar.f4615t;
        eVar.f4549u = jVar.f4616u;
        eVar.f4550v = jVar.f4617v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.I;
        eVar.A = jVar.R;
        eVar.B = jVar.Q;
        eVar.f4552x = jVar.N;
        eVar.f4554z = jVar.P;
        eVar.E = jVar.f4618w;
        eVar.F = jVar.f4619x;
        eVar.f4543p = jVar.f4621z;
        eVar.f4545q = jVar.A;
        eVar.f4546r = jVar.B;
        eVar.G = jVar.f4620y;
        eVar.T = jVar.C;
        eVar.U = jVar.D;
        eVar.I = jVar.T;
        eVar.H = jVar.U;
        eVar.K = jVar.W;
        eVar.J = jVar.V;
        eVar.W = jVar.f4604l0;
        eVar.X = jVar.f4606m0;
        eVar.L = jVar.X;
        eVar.M = jVar.Y;
        eVar.P = jVar.Z;
        eVar.Q = jVar.f4582a0;
        eVar.N = jVar.f4584b0;
        eVar.O = jVar.f4586c0;
        eVar.R = jVar.f4588d0;
        eVar.S = jVar.f4590e0;
        eVar.V = jVar.E;
        eVar.f4517c = jVar.f4591f;
        eVar.f4513a = jVar.f4587d;
        eVar.f4515b = jVar.f4589e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f4583b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f4585c;
        String str = jVar.f4602k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.Z = jVar.f4610o0;
        eVar.setMarginStart(jVar.K);
        eVar.setMarginEnd(jVar.J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f4577d;
        jVar.getClass();
        j jVar2 = this.f4577d;
        jVar.f4581a = jVar2.f4581a;
        jVar.f4583b = jVar2.f4583b;
        jVar.f4585c = jVar2.f4585c;
        jVar.f4587d = jVar2.f4587d;
        jVar.f4589e = jVar2.f4589e;
        jVar.f4591f = jVar2.f4591f;
        jVar.f4593g = jVar2.f4593g;
        jVar.f4595h = jVar2.f4595h;
        jVar.f4597i = jVar2.f4597i;
        jVar.f4599j = jVar2.f4599j;
        jVar.f4601k = jVar2.f4601k;
        jVar.f4603l = jVar2.f4603l;
        jVar.f4605m = jVar2.f4605m;
        jVar.f4607n = jVar2.f4607n;
        jVar.f4609o = jVar2.f4609o;
        jVar.f4611p = jVar2.f4611p;
        jVar.f4612q = jVar2.f4612q;
        jVar.f4613r = jVar2.f4613r;
        jVar.f4614s = jVar2.f4614s;
        jVar.f4615t = jVar2.f4615t;
        jVar.f4616u = jVar2.f4616u;
        jVar.f4617v = jVar2.f4617v;
        jVar.f4618w = jVar2.f4618w;
        jVar.f4619x = jVar2.f4619x;
        jVar.f4620y = jVar2.f4620y;
        jVar.f4621z = jVar2.f4621z;
        jVar.A = jVar2.A;
        jVar.B = jVar2.B;
        jVar.C = jVar2.C;
        jVar.D = jVar2.D;
        jVar.E = jVar2.E;
        jVar.F = jVar2.F;
        jVar.G = jVar2.G;
        jVar.H = jVar2.H;
        jVar.I = jVar2.I;
        jVar.J = jVar2.J;
        jVar.K = jVar2.K;
        jVar.L = jVar2.L;
        jVar.M = jVar2.M;
        jVar.N = jVar2.N;
        jVar.O = jVar2.O;
        jVar.P = jVar2.P;
        jVar.Q = jVar2.Q;
        jVar.R = jVar2.R;
        jVar.S = jVar2.S;
        jVar.T = jVar2.T;
        jVar.U = jVar2.U;
        jVar.V = jVar2.V;
        jVar.W = jVar2.W;
        jVar.X = jVar2.X;
        jVar.Y = jVar2.Y;
        jVar.Z = jVar2.Z;
        jVar.f4582a0 = jVar2.f4582a0;
        jVar.f4584b0 = jVar2.f4584b0;
        jVar.f4586c0 = jVar2.f4586c0;
        jVar.f4588d0 = jVar2.f4588d0;
        jVar.f4590e0 = jVar2.f4590e0;
        jVar.f4592f0 = jVar2.f4592f0;
        jVar.f4594g0 = jVar2.f4594g0;
        jVar.f4596h0 = jVar2.f4596h0;
        jVar.f4602k0 = jVar2.f4602k0;
        int[] iArr = jVar2.f4598i0;
        if (iArr == null || jVar2.f4600j0 != null) {
            jVar.f4598i0 = null;
        } else {
            jVar.f4598i0 = Arrays.copyOf(iArr, iArr.length);
        }
        jVar.f4600j0 = jVar2.f4600j0;
        jVar.f4604l0 = jVar2.f4604l0;
        jVar.f4606m0 = jVar2.f4606m0;
        jVar.f4608n0 = jVar2.f4608n0;
        jVar.f4610o0 = jVar2.f4610o0;
        k kVar = iVar.f4576c;
        kVar.getClass();
        k kVar2 = this.f4576c;
        kVar2.getClass();
        kVar.f4623a = kVar2.f4623a;
        kVar.f4625c = kVar2.f4625c;
        kVar.f4627e = kVar2.f4627e;
        kVar.f4626d = kVar2.f4626d;
        l lVar = iVar.f4575b;
        lVar.getClass();
        l lVar2 = this.f4575b;
        lVar2.getClass();
        lVar.f4632a = lVar2.f4632a;
        lVar.f4634c = lVar2.f4634c;
        lVar.f4635d = lVar2.f4635d;
        lVar.f4633b = lVar2.f4633b;
        m mVar = iVar.f4578e;
        mVar.getClass();
        m mVar2 = this.f4578e;
        mVar2.getClass();
        mVar.f4637a = mVar2.f4637a;
        mVar.f4638b = mVar2.f4638b;
        mVar.f4639c = mVar2.f4639c;
        mVar.f4640d = mVar2.f4640d;
        mVar.f4641e = mVar2.f4641e;
        mVar.f4642f = mVar2.f4642f;
        mVar.f4643g = mVar2.f4643g;
        mVar.f4644h = mVar2.f4644h;
        mVar.f4645i = mVar2.f4645i;
        mVar.f4646j = mVar2.f4646j;
        mVar.f4647k = mVar2.f4647k;
        mVar.f4648l = mVar2.f4648l;
        mVar.f4649m = mVar2.f4649m;
        iVar.f4574a = this.f4574a;
        return iVar;
    }
}
