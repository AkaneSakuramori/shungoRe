.class public final Le/e0;
.super Le/r;
.source "SourceFile"

# interfaces
.implements Lh/m;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final i0:Ln/k;

.field public static final j0:[I

.field public static final k0:Z

.field public static final l0:Z


# instance fields
.field public A:Z

.field public B:Landroid/view/ViewGroup;

.field public C:Landroid/widget/TextView;

.field public D:Landroid/view/View;

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:[Le/d0;

.field public N:Le/d0;

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:Z

.field public S:Landroid/content/res/Configuration;

.field public final T:I

.field public U:I

.field public V:I

.field public W:Z

.field public X:Le/z;

.field public Y:Le/z;

.field public Z:Z

.field public a0:I

.field public final b0:Le/s;

.field public c0:Z

.field public d0:Landroid/graphics/Rect;

.field public e0:Landroid/graphics/Rect;

.field public f0:Le/h0;

.field public g0:Landroid/window/OnBackInvokedDispatcher;

.field public h0:Landroid/window/OnBackInvokedCallback;

.field public final k:Ljava/lang/Object;

.field public final l:Landroid/content/Context;

.field public m:Landroid/view/Window;

.field public n:Le/y;

.field public final o:Le/n;

.field public p:Le/s0;

.field public q:Lg/l;

.field public r:Ljava/lang/CharSequence;

.field public s:Li/r1;

.field public t:Le/t;

.field public u:Le/t;

.field public v:Lg/c;

.field public w:Landroidx/appcompat/widget/ActionBarContextView;

.field public x:Landroid/widget/PopupWindow;

.field public y:Le/s;

.field public z:Li0/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln/k;

    invoke-direct {v0}, Ln/k;-><init>()V

    sput-object v0, Le/e0;->i0:Ln/k;

    const v0, 0x1010054

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Le/e0;->j0:[I

    const-string v0, "robolectric"

    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    sput-boolean v0, Le/e0;->k0:Z

    sput-boolean v1, Le/e0;->l0:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Le/n;Ljava/lang/Object;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le/e0;->z:Li0/d1;

    const/16 v1, -0x64

    iput v1, p0, Le/e0;->T:I

    new-instance v2, Le/s;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Le/s;-><init>(Le/e0;I)V

    iput-object v2, p0, Le/e0;->b0:Le/s;

    iput-object p1, p0, Le/e0;->l:Landroid/content/Context;

    iput-object p3, p0, Le/e0;->o:Le/n;

    iput-object p4, p0, Le/e0;->k:Ljava/lang/Object;

    instance-of p3, p4, Landroid/app/Dialog;

    if-eqz p3, :cond_2

    :goto_0
    if-eqz p1, :cond_1

    instance-of p3, p1, Le/m;

    if-eqz p3, :cond_0

    check-cast p1, Le/m;

    goto :goto_1

    :cond_0
    instance-of p3, p1, Landroid/content/ContextWrapper;

    if-eqz p3, :cond_1

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Le/m;->l()Le/r;

    move-result-object p1

    check-cast p1, Le/e0;

    iget p1, p1, Le/e0;->T:I

    iput p1, p0, Le/e0;->T:I

    :cond_2
    iget p1, p0, Le/e0;->T:I

    if-ne p1, v1, :cond_3

    sget-object p1, Le/e0;->i0:Ln/k;

    iget-object p3, p0, Le/e0;->k:Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3, v0}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iput p3, p0, Le/e0;->T:I

    iget-object p3, p0, Le/e0;->k:Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {p0, p2}, Le/e0;->o(Landroid/view/Window;)V

    :cond_4
    invoke-static {}, Li/x;->c()V

    return-void
.end method

.method public static p(Landroid/content/Context;)Le0/h;
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    return-object v2

    :cond_0
    sget-object v0, Le/r;->d:Le0/h;

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    invoke-static {p0}, Le/w;->b(Landroid/content/res/Configuration;)Le0/h;

    move-result-object p0

    iget-object v0, v0, Le0/h;->a:Le0/i;

    move-object v1, v0

    check-cast v1, Le0/j;

    iget-object v1, v1, Le0/j;->a:Landroid/os/LocaleList;

    invoke-virtual {v1}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Le0/h;->b:Le0/h;

    goto :goto_2

    :cond_2
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v2, 0x0

    :goto_0
    move-object v3, v0

    check-cast v3, Le0/j;

    iget-object v3, v3, Le0/j;->a:Landroid/os/LocaleList;

    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    move-result v3

    iget-object v4, p0, Le0/h;->a:Le0/i;

    check-cast v4, Le0/j;

    iget-object v4, v4, Le0/j;->a:Landroid/os/LocaleList;

    invoke-virtual {v4}, Landroid/os/LocaleList;->size()I

    move-result v4

    add-int/2addr v4, v3

    if-ge v2, v4, :cond_5

    move-object v3, v0

    check-cast v3, Le0/j;

    iget-object v3, v3, Le0/j;->a:Landroid/os/LocaleList;

    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    move-object v3, v0

    check-cast v3, Le0/j;

    iget-object v3, v3, Le0/j;->a:Landroid/os/LocaleList;

    invoke-virtual {v3, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v0

    check-cast v3, Le0/j;

    iget-object v3, v3, Le0/j;->a:Landroid/os/LocaleList;

    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    move-result v3

    sub-int v3, v2, v3

    iget-object v4, p0, Le0/h;->a:Le0/i;

    check-cast v4, Le0/j;

    iget-object v4, v4, Le0/j;->a:Landroid/os/LocaleList;

    invoke-virtual {v4, v3}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_4

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [Ljava/util/Locale;

    invoke-interface {v1, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/util/Locale;

    invoke-static {v0}, Le0/g;->a([Ljava/util/Locale;)Landroid/os/LocaleList;

    move-result-object v0

    new-instance v1, Le0/h;

    new-instance v2, Le0/j;

    invoke-direct {v2, v0}, Le0/j;-><init>(Ljava/lang/Object;)V

    invoke-direct {v1, v2}, Le0/h;-><init>(Le0/j;)V

    move-object v0, v1

    :goto_2
    iget-object v1, v0, Le0/h;->a:Le0/i;

    check-cast v1, Le0/j;

    iget-object v1, v1, Le0/j;->a:Landroid/os/LocaleList;

    invoke-virtual {v1}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    move-object p0, v0

    :goto_3
    return-object p0
.end method

.method public static t(Landroid/content/Context;ILe0/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    if-eqz p4, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    goto :goto_0

    :cond_1
    const/16 p0, 0x20

    goto :goto_0

    :cond_2
    const/16 p0, 0x10

    :goto_0
    new-instance p1, Landroid/content/res/Configuration;

    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    const/4 p4, 0x0

    iput p4, p1, Landroid/content/res/Configuration;->fontScale:F

    if-eqz p3, :cond_3

    invoke-virtual {p1, p3}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    :cond_3
    iget p3, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p3, p3, -0x31

    or-int/2addr p0, p3

    iput p0, p1, Landroid/content/res/Configuration;->uiMode:I

    if-eqz p2, :cond_4

    invoke-static {p1, p2}, Le/w;->d(Landroid/content/res/Configuration;Le0/h;)V

    :cond_4
    return-object p1
.end method


# virtual methods
.method public final A()V
    .locals 3

    invoke-virtual {p0}, Le/e0;->w()V

    iget-boolean v0, p0, Le/e0;->G:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Le/e0;->p:Le/s0;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Le/e0;->k:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    new-instance v1, Le/s0;

    check-cast v0, Landroid/app/Activity;

    iget-boolean v2, p0, Le/e0;->H:Z

    invoke-direct {v1, v0, v2}, Le/s0;-><init>(Landroid/app/Activity;Z)V

    iput-object v1, p0, Le/e0;->p:Le/s0;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Landroid/app/Dialog;

    if-eqz v1, :cond_2

    new-instance v1, Le/s0;

    check-cast v0, Landroid/app/Dialog;

    invoke-direct {v1, v0}, Le/s0;-><init>(Landroid/app/Dialog;)V

    iput-object v1, p0, Le/e0;->p:Le/s0;

    :cond_2
    :goto_0
    iget-object v0, p0, Le/e0;->p:Le/s0;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, Le/e0;->c0:Z

    invoke-virtual {v0, v1}, Le/s0;->T2(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final B(I)V
    .locals 2

    iget v0, p0, Le/e0;->a0:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    or-int/2addr p1, v0

    iput p1, p0, Le/e0;->a0:I

    iget-boolean p1, p0, Le/e0;->Z:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    sget-object v0, Li0/v0;->a:Ljava/util/WeakHashMap;

    iget-object v0, p0, Le/e0;->b0:Le/s;

    invoke-static {p1, v0}, Li0/e0;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    iput-boolean v1, p0, Le/e0;->Z:Z

    :cond_0
    return-void
.end method

.method public final C(Landroid/content/Context;I)I
    .locals 2

    const/16 v0, -0x64

    const/4 v1, -0x1

    if-eq p2, v0, :cond_5

    if-eq p2, v1, :cond_4

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_4

    const/4 v0, 0x3

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Le/e0;->Y:Le/z;

    if-nez p2, :cond_0

    new-instance p2, Le/z;

    invoke-direct {p2, p0, p1}, Le/z;-><init>(Le/e0;Landroid/content/Context;)V

    iput-object p2, p0, Le/e0;->Y:Le/z;

    :cond_0
    iget-object p1, p0, Le/e0;->Y:Le/z;

    invoke-virtual {p1}, Le/z;->d()I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "uimode"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/UiModeManager;

    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    move-result p2

    if-nez p2, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0, p1}, Le/e0;->y(Landroid/content/Context;)Le/b0;

    move-result-object p1

    invoke-virtual {p1}, Le/b0;->d()I

    move-result p1

    return p1

    :cond_4
    return p2

    :cond_5
    return v1
.end method

.method public final D()Z
    .locals 5

    iget-boolean v0, p0, Le/e0;->O:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Le/e0;->O:Z

    invoke-virtual {p0, v1}, Le/e0;->z(I)Le/d0;

    move-result-object v2

    iget-boolean v3, v2, Le/d0;->m:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-nez v0, :cond_0

    invoke-virtual {p0, v2, v4}, Le/e0;->s(Le/d0;Z)V

    :cond_0
    return v4

    :cond_1
    iget-object v0, p0, Le/e0;->v:Lg/c;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lg/c;->a()V

    return v4

    :cond_2
    invoke-virtual {p0}, Le/e0;->A()V

    iget-object v0, p0, Le/e0;->p:Le/s0;

    if-eqz v0, :cond_5

    iget-object v0, v0, Le/s0;->n:Li/s1;

    if-eqz v0, :cond_5

    move-object v2, v0

    check-cast v2, Li/x3;

    iget-object v2, v2, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->M:Li/t3;

    if-eqz v2, :cond_5

    iget-object v2, v2, Li/t3;->c:Lh/q;

    if-eqz v2, :cond_5

    check-cast v0, Li/x3;

    iget-object v0, v0, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->M:Li/t3;

    if-nez v0, :cond_3

    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    iget-object v0, v0, Li/t3;->c:Lh/q;

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lh/q;->collapseActionView()Z

    :cond_4
    return v4

    :cond_5
    return v1
.end method

.method public final E(Le/d0;Landroid/view/KeyEvent;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v1, Le/d0;->m:Z

    if-nez v2, :cond_1b

    iget-boolean v2, v0, Le/e0;->R:Z

    if-eqz v2, :cond_0

    goto/16 :goto_9

    :cond_0
    iget v2, v1, Le/d0;->a:I

    iget-object v3, v0, Le/e0;->l:Landroid/content/Context;

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    iget v5, v5, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v5, v5, 0xf

    if-ne v5, v4, :cond_1

    return-void

    :cond_1
    iget-object v5, v0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v5}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v5

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    iget-object v7, v1, Le/d0;->h:Lh/o;

    invoke-interface {v5, v2, v7}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v0, v1, v6}, Le/e0;->s(Le/d0;Z)V

    return-void

    :cond_2
    const-string v5, "window"

    invoke-virtual {v3, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/WindowManager;

    if-nez v5, :cond_3

    return-void

    :cond_3
    invoke-virtual/range {p0 .. p2}, Le/e0;->G(Le/d0;Landroid/view/KeyEvent;)Z

    move-result v7

    if-nez v7, :cond_4

    return-void

    :cond_4
    iget-object v7, v1, Le/d0;->e:Le/c0;

    const/4 v8, 0x0

    const/4 v9, -0x2

    if-eqz v7, :cond_6

    iget-boolean v10, v1, Le/d0;->n:Z

    if-eqz v10, :cond_5

    goto :goto_0

    :cond_5
    iget-object v3, v1, Le/d0;->g:Landroid/view/View;

    if-eqz v3, :cond_18

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-eqz v3, :cond_18

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_18

    move v11, v4

    goto/16 :goto_7

    :cond_6
    :goto_0
    if-nez v7, :cond_b

    invoke-virtual/range {p0 .. p0}, Le/e0;->A()V

    iget-object v7, v0, Le/e0;->p:Le/s0;

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Le/s0;->R2()Landroid/content/Context;

    move-result-object v7

    goto :goto_1

    :cond_7
    const/4 v7, 0x0

    :goto_1
    if-nez v7, :cond_8

    goto :goto_2

    :cond_8
    move-object v3, v7

    :goto_2
    new-instance v7, Landroid/util/TypedValue;

    invoke-direct {v7}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v10

    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v11

    invoke-virtual {v10, v11}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    const v11, 0x7f030004

    invoke-virtual {v10, v11, v7, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v11, v7, Landroid/util/TypedValue;->resourceId:I

    if-eqz v11, :cond_9

    invoke-virtual {v10, v11, v6}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_9
    const v11, 0x7f030368

    invoke-virtual {v10, v11, v7, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v7, v7, Landroid/util/TypedValue;->resourceId:I

    if-eqz v7, :cond_a

    invoke-virtual {v10, v7, v6}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    goto :goto_3

    :cond_a
    const v7, 0x7f10020c

    invoke-virtual {v10, v7, v6}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :goto_3
    new-instance v7, Lg/f;

    invoke-direct {v7, v3, v8}, Lg/f;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v7}, Lg/f;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v3, v10}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iput-object v7, v1, Le/d0;->j:Lg/f;

    sget-object v3, Ld/a;->j:[I

    invoke-virtual {v7, v3}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v3

    const/16 v7, 0x56

    invoke-virtual {v3, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v1, Le/d0;->b:I

    invoke-virtual {v3, v6, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v1, Le/d0;->d:I

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v3, Le/c0;

    iget-object v7, v1, Le/d0;->j:Lg/f;

    invoke-direct {v3, v0, v7}, Le/c0;-><init>(Le/e0;Lg/f;)V

    iput-object v3, v1, Le/d0;->e:Le/c0;

    const/16 v3, 0x51

    iput v3, v1, Le/d0;->c:I

    goto :goto_4

    :cond_b
    iget-boolean v3, v1, Le/d0;->n:Z

    if-eqz v3, :cond_c

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-lez v3, :cond_c

    iget-object v3, v1, Le/d0;->e:Le/c0;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_c
    :goto_4
    iget-object v3, v1, Le/d0;->g:Landroid/view/View;

    if-eqz v3, :cond_d

    iput-object v3, v1, Le/d0;->f:Landroid/view/View;

    goto :goto_5

    :cond_d
    iget-object v3, v1, Le/d0;->h:Lh/o;

    if-nez v3, :cond_e

    goto/16 :goto_8

    :cond_e
    iget-object v3, v0, Le/e0;->u:Le/t;

    if-nez v3, :cond_f

    new-instance v3, Le/t;

    invoke-direct {v3, v0, v4}, Le/t;-><init>(Le/e0;I)V

    iput-object v3, v0, Le/e0;->u:Le/t;

    :cond_f
    iget-object v3, v0, Le/e0;->u:Le/t;

    iget-object v4, v1, Le/d0;->i:Lh/k;

    if-nez v4, :cond_10

    new-instance v4, Lh/k;

    iget-object v7, v1, Le/d0;->j:Lg/f;

    invoke-direct {v4, v7}, Lh/k;-><init>(Landroid/content/Context;)V

    iput-object v4, v1, Le/d0;->i:Lh/k;

    iput-object v3, v4, Lh/k;->f:Lh/b0;

    iget-object v3, v1, Le/d0;->h:Lh/o;

    iget-object v7, v3, Lh/o;->a:Landroid/content/Context;

    invoke-virtual {v3, v4, v7}, Lh/o;->b(Lh/c0;Landroid/content/Context;)V

    :cond_10
    iget-object v3, v1, Le/d0;->i:Lh/k;

    iget-object v4, v1, Le/d0;->e:Le/c0;

    iget-object v7, v3, Lh/k;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    if-nez v7, :cond_12

    iget-object v7, v3, Lh/k;->c:Landroid/view/LayoutInflater;

    const v10, 0x7f0b000d

    invoke-virtual {v7, v10, v4, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/appcompat/view/menu/ExpandedMenuView;

    iput-object v4, v3, Lh/k;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v4, v3, Lh/k;->g:Lh/j;

    if-nez v4, :cond_11

    new-instance v4, Lh/j;

    invoke-direct {v4, v3}, Lh/j;-><init>(Lh/k;)V

    iput-object v4, v3, Lh/k;->g:Lh/j;

    :cond_11
    iget-object v4, v3, Lh/k;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v7, v3, Lh/k;->g:Lh/j;

    invoke-virtual {v4, v7}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v4, v3, Lh/k;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    invoke-virtual {v4, v3}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :cond_12
    iget-object v3, v3, Lh/k;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iput-object v3, v1, Le/d0;->f:Landroid/view/View;

    if-eqz v3, :cond_1a

    :goto_5
    iget-object v3, v1, Le/d0;->f:Landroid/view/View;

    if-nez v3, :cond_13

    goto/16 :goto_8

    :cond_13
    iget-object v3, v1, Le/d0;->g:Landroid/view/View;

    if-eqz v3, :cond_14

    goto :goto_6

    :cond_14
    iget-object v3, v1, Le/d0;->i:Lh/k;

    iget-object v4, v3, Lh/k;->g:Lh/j;

    if-nez v4, :cond_15

    new-instance v4, Lh/j;

    invoke-direct {v4, v3}, Lh/j;-><init>(Lh/k;)V

    iput-object v4, v3, Lh/k;->g:Lh/j;

    :cond_15
    iget-object v3, v3, Lh/k;->g:Lh/j;

    invoke-virtual {v3}, Lh/j;->getCount()I

    move-result v3

    if-lez v3, :cond_1a

    :goto_6
    iget-object v3, v1, Le/d0;->f:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-nez v3, :cond_16

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v3, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_16
    iget v4, v1, Le/d0;->b:I

    iget-object v7, v1, Le/d0;->e:Le/c0;

    invoke-virtual {v7, v4}, Le/c0;->setBackgroundResource(I)V

    iget-object v4, v1, Le/d0;->f:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    instance-of v7, v4, Landroid/view/ViewGroup;

    if-eqz v7, :cond_17

    check-cast v4, Landroid/view/ViewGroup;

    iget-object v7, v1, Le/d0;->f:Landroid/view/View;

    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_17
    iget-object v4, v1, Le/d0;->e:Le/c0;

    iget-object v7, v1, Le/d0;->f:Landroid/view/View;

    invoke-virtual {v4, v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v3, v1, Le/d0;->f:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->hasFocus()Z

    move-result v3

    if-nez v3, :cond_18

    iget-object v3, v1, Le/d0;->f:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    :cond_18
    move v11, v9

    :goto_7
    iput-boolean v8, v1, Le/d0;->l:Z

    new-instance v3, Landroid/view/WindowManager$LayoutParams;

    const/4 v12, -0x2

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x3ea

    const/high16 v16, 0x820000

    const/16 v17, -0x3

    move-object v10, v3

    invoke-direct/range {v10 .. v17}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    iget v4, v1, Le/d0;->c:I

    iput v4, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v4, v1, Le/d0;->d:I

    iput v4, v3, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    iget-object v4, v1, Le/d0;->e:Le/c0;

    invoke-interface {v5, v4, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-boolean v6, v1, Le/d0;->m:Z

    if-nez v2, :cond_19

    invoke-virtual/range {p0 .. p0}, Le/e0;->I()V

    :cond_19
    return-void

    :cond_1a
    :goto_8
    iput-boolean v6, v1, Le/d0;->n:Z

    :cond_1b
    :goto_9
    return-void
.end method

.method public final F(Le/d0;ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Le/d0;->k:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3}, Le/e0;->G(Le/d0;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object p1, p1, Le/d0;->h:Lh/o;

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Lh/o;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v1

    :cond_2
    return v1
.end method

.method public final G(Le/d0;Landroid/view/KeyEvent;)Z
    .locals 12

    iget-boolean v0, p0, Le/e0;->R:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Le/d0;->k:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Le/e0;->N:Le/d0;

    if-eqz v0, :cond_2

    if-eq v0, p1, :cond_2

    invoke-virtual {p0, v0, v1}, Le/e0;->s(Le/d0;Z)V

    :cond_2
    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    iget v3, p1, Le/d0;->a:I

    if-eqz v0, :cond_3

    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v4

    iput-object v4, p1, Le/d0;->g:Landroid/view/View;

    :cond_3
    const/16 v4, 0x6c

    if-eqz v3, :cond_5

    if-ne v3, v4, :cond_4

    goto :goto_0

    :cond_4
    move v5, v1

    goto :goto_1

    :cond_5
    :goto_0
    move v5, v2

    :goto_1
    if-eqz v5, :cond_6

    iget-object v6, p0, Le/e0;->s:Li/r1;

    if-eqz v6, :cond_6

    check-cast v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v6, v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast v6, Li/x3;

    iput-boolean v2, v6, Li/x3;->l:Z

    :cond_6
    iget-object v6, p1, Le/d0;->g:Landroid/view/View;

    if-nez v6, :cond_1d

    iget-object v6, p1, Le/d0;->h:Lh/o;

    const/4 v7, 0x0

    if-eqz v6, :cond_7

    iget-boolean v8, p1, Le/d0;->o:Z

    if-eqz v8, :cond_17

    :cond_7
    if-nez v6, :cond_10

    iget-object v6, p0, Le/e0;->l:Landroid/content/Context;

    if-eqz v3, :cond_8

    if-ne v3, v4, :cond_c

    :cond_8
    iget-object v4, p0, Le/e0;->s:Li/r1;

    if-eqz v4, :cond_c

    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    const v9, 0x7f03000b

    invoke-virtual {v8, v9, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    const v10, 0x7f03000c

    if-eqz v9, :cond_9

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v11, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v9, v11, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    invoke-virtual {v9, v10, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_2

    :cond_9
    invoke-virtual {v8, v10, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-object v9, v7

    :goto_2
    iget v10, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v10, :cond_b

    if-nez v9, :cond_a

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :cond_a
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v9, v4, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_b
    if-eqz v9, :cond_c

    new-instance v4, Lg/f;

    invoke-direct {v4, v6, v1}, Lg/f;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4}, Lg/f;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v6, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v6, v4

    :cond_c
    new-instance v4, Lh/o;

    invoke-direct {v4, v6}, Lh/o;-><init>(Landroid/content/Context;)V

    iput-object p0, v4, Lh/o;->e:Lh/m;

    iget-object v6, p1, Le/d0;->h:Lh/o;

    if-ne v4, v6, :cond_d

    goto :goto_3

    :cond_d
    if-eqz v6, :cond_e

    iget-object v8, p1, Le/d0;->i:Lh/k;

    invoke-virtual {v6, v8}, Lh/o;->r(Lh/c0;)V

    :cond_e
    iput-object v4, p1, Le/d0;->h:Lh/o;

    iget-object v6, p1, Le/d0;->i:Lh/k;

    if-eqz v6, :cond_f

    iget-object v8, v4, Lh/o;->a:Landroid/content/Context;

    invoke-virtual {v4, v6, v8}, Lh/o;->b(Lh/c0;Landroid/content/Context;)V

    :cond_f
    :goto_3
    iget-object v4, p1, Le/d0;->h:Lh/o;

    if-nez v4, :cond_10

    return v1

    :cond_10
    if-eqz v5, :cond_12

    iget-object v4, p0, Le/e0;->s:Li/r1;

    if-eqz v4, :cond_12

    iget-object v6, p0, Le/e0;->t:Le/t;

    if-nez v6, :cond_11

    new-instance v6, Le/t;

    const/4 v8, 0x3

    invoke-direct {v6, p0, v8}, Le/t;-><init>(Le/e0;I)V

    iput-object v6, p0, Le/e0;->t:Le/t;

    :cond_11
    iget-object v6, p1, Le/d0;->h:Lh/o;

    iget-object v8, p0, Le/e0;->t:Le/t;

    check-cast v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v4, v6, v8}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Lh/o;Le/t;)V

    :cond_12
    iget-object v4, p1, Le/d0;->h:Lh/o;

    invoke-virtual {v4}, Lh/o;->w()V

    iget-object v4, p1, Le/d0;->h:Lh/o;

    invoke-interface {v0, v3, v4}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v3

    if-nez v3, :cond_16

    iget-object p2, p1, Le/d0;->h:Lh/o;

    if-nez p2, :cond_13

    goto :goto_4

    :cond_13
    if-eqz p2, :cond_14

    iget-object v0, p1, Le/d0;->i:Lh/k;

    invoke-virtual {p2, v0}, Lh/o;->r(Lh/c0;)V

    :cond_14
    iput-object v7, p1, Le/d0;->h:Lh/o;

    :goto_4
    if-eqz v5, :cond_15

    iget-object p1, p0, Le/e0;->s:Li/r1;

    if-eqz p1, :cond_15

    iget-object p2, p0, Le/e0;->t:Le/t;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1, v7, p2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Lh/o;Le/t;)V

    :cond_15
    return v1

    :cond_16
    iput-boolean v1, p1, Le/d0;->o:Z

    :cond_17
    iget-object v3, p1, Le/d0;->h:Lh/o;

    invoke-virtual {v3}, Lh/o;->w()V

    iget-object v3, p1, Le/d0;->p:Landroid/os/Bundle;

    if-eqz v3, :cond_18

    iget-object v4, p1, Le/d0;->h:Lh/o;

    invoke-virtual {v4, v3}, Lh/o;->s(Landroid/os/Bundle;)V

    iput-object v7, p1, Le/d0;->p:Landroid/os/Bundle;

    :cond_18
    iget-object v3, p1, Le/d0;->g:Landroid/view/View;

    iget-object v4, p1, Le/d0;->h:Lh/o;

    invoke-interface {v0, v1, v3, v4}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_1a

    if-eqz v5, :cond_19

    iget-object p2, p0, Le/e0;->s:Li/r1;

    if-eqz p2, :cond_19

    iget-object v0, p0, Le/e0;->t:Le/t;

    check-cast p2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p2, v7, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Lh/o;Le/t;)V

    :cond_19
    iget-object p1, p1, Le/d0;->h:Lh/o;

    invoke-virtual {p1}, Lh/o;->v()V

    return v1

    :cond_1a
    if-eqz p2, :cond_1b

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2

    goto :goto_5

    :cond_1b
    const/4 p2, -0x1

    :goto_5
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result p2

    if-eq p2, v2, :cond_1c

    move p2, v2

    goto :goto_6

    :cond_1c
    move p2, v1

    :goto_6
    iget-object v0, p1, Le/d0;->h:Lh/o;

    invoke-virtual {v0, p2}, Lh/o;->setQwertyMode(Z)V

    iget-object p2, p1, Le/d0;->h:Lh/o;

    invoke-virtual {p2}, Lh/o;->v()V

    :cond_1d
    iput-boolean v2, p1, Le/d0;->k:Z

    iput-boolean v1, p1, Le/d0;->l:Z

    iput-object p1, p0, Le/e0;->N:Le/d0;

    return v2
.end method

.method public final H()V
    .locals 2

    iget-boolean v0, p0, Le/e0;->A:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final I()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_4

    iget-object v0, p0, Le/e0;->g0:Landroid/window/OnBackInvokedDispatcher;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, Le/e0;->z(I)Le/d0;

    move-result-object v0

    iget-boolean v0, v0, Le/d0;->m:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Le/e0;->v:Lg/c;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    iget-object v0, p0, Le/e0;->h0:Landroid/window/OnBackInvokedCallback;

    if-nez v0, :cond_3

    iget-object v0, p0, Le/e0;->g0:Landroid/window/OnBackInvokedDispatcher;

    invoke-static {v0, p0}, Le/x;->b(Ljava/lang/Object;Le/e0;)Landroid/window/OnBackInvokedCallback;

    move-result-object v0

    iput-object v0, p0, Le/e0;->h0:Landroid/window/OnBackInvokedCallback;

    goto :goto_2

    :cond_3
    if-nez v1, :cond_4

    iget-object v0, p0, Le/e0;->h0:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_4

    iget-object v1, p0, Le/e0;->g0:Landroid/window/OnBackInvokedDispatcher;

    invoke-static {v1, v0}, Le/x;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final J(Li0/c2;Landroid/graphics/Rect;)I
    .locals 11

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Li0/c2;->d()I

    move-result v1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget v1, p2, Landroid/graphics/Rect;->top:I

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    iget-object v2, p0, Le/e0;->w:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v3, 0x8

    if-eqz v2, :cond_12

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    instance-of v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v2, :cond_12

    iget-object v2, p0, Le/e0;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v4, p0, Le/e0;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_10

    iget-object v4, p0, Le/e0;->d0:Landroid/graphics/Rect;

    if-nez v4, :cond_2

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Le/e0;->d0:Landroid/graphics/Rect;

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Le/e0;->e0:Landroid/graphics/Rect;

    :cond_2
    iget-object v4, p0, Le/e0;->d0:Landroid/graphics/Rect;

    iget-object v6, p0, Le/e0;->e0:Landroid/graphics/Rect;

    if-nez p1, :cond_3

    invoke-virtual {v4, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Li0/c2;->b()I

    move-result p2

    invoke-virtual {p1}, Li0/c2;->d()I

    move-result v7

    invoke-virtual {p1}, Li0/c2;->c()I

    move-result v8

    invoke-virtual {p1}, Li0/c2;->a()I

    move-result p1

    invoke-virtual {v4, p2, v7, v8, p1}, Landroid/graphics/Rect;->set(IIII)V

    :goto_1
    iget-object p1, p0, Le/e0;->B:Landroid/view/ViewGroup;

    sget-object p2, Li/b4;->a:Ljava/lang/reflect/Method;

    if-eqz p2, :cond_4

    :try_start_0
    filled-new-array {v4, v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p2, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string p2, "ViewUtils"

    const-string v6, "Could not invoke computeFitSystemWindows"

    invoke-static {p2, v6, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_4
    :goto_2
    iget p1, v4, Landroid/graphics/Rect;->top:I

    iget p2, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    iget-object v6, p0, Le/e0;->B:Landroid/view/ViewGroup;

    sget-object v7, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v6}, Li0/l0;->a(Landroid/view/View;)Li0/c2;

    move-result-object v6

    if-nez v6, :cond_5

    move v7, v0

    goto :goto_3

    :cond_5
    invoke-virtual {v6}, Li0/c2;->b()I

    move-result v7

    :goto_3
    if-nez v6, :cond_6

    move v6, v0

    goto :goto_4

    :cond_6
    invoke-virtual {v6}, Li0/c2;->c()I

    move-result v6

    :goto_4
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v8, p1, :cond_8

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v8, p2, :cond_8

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v8, v4, :cond_7

    goto :goto_5

    :cond_7
    move p2, v0

    goto :goto_6

    :cond_8
    :goto_5
    iput p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput p2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move p2, v5

    :goto_6
    iget-object v4, p0, Le/e0;->l:Landroid/content/Context;

    if-lez p1, :cond_9

    iget-object p1, p0, Le/e0;->D:Landroid/view/View;

    if-nez p1, :cond_9

    new-instance p1, Landroid/view/View;

    invoke-direct {p1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Le/e0;->D:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/4 v9, -0x1

    const/16 v10, 0x33

    invoke-direct {p1, v9, v8, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    iput v7, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v6, p1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget-object v6, p0, Le/e0;->B:Landroid/view/ViewGroup;

    iget-object v7, p0, Le/e0;->D:Landroid/view/View;

    invoke-virtual {v6, v7, v9, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_7

    :cond_9
    iget-object p1, p0, Le/e0;->D:Landroid/view/View;

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v8, v9, :cond_a

    iget v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v8, v7, :cond_a

    iget v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v8, v6, :cond_b

    :cond_a
    iput v9, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v7, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v6, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget-object v6, p0, Le/e0;->D:Landroid/view/View;

    invoke-virtual {v6, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_b
    :goto_7
    iget-object p1, p0, Le/e0;->D:Landroid/view/View;

    if-eqz p1, :cond_c

    goto :goto_8

    :cond_c
    move v5, v0

    :goto_8
    if-eqz v5, :cond_e

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Le/e0;->D:Landroid/view/View;

    invoke-static {p1}, Li0/e0;->g(Landroid/view/View;)I

    move-result v6

    and-int/lit16 v6, v6, 0x2000

    if-eqz v6, :cond_d

    sget-object v6, Lz/d;->a:Ljava/lang/Object;

    const v6, 0x7f050006

    invoke-static {v4, v6}, Lz/c;->a(Landroid/content/Context;I)I

    move-result v4

    goto :goto_9

    :cond_d
    sget-object v6, Lz/d;->a:Ljava/lang/Object;

    const v6, 0x7f050005

    invoke-static {v4, v6}, Lz/c;->a(Landroid/content/Context;I)I

    move-result v4

    :goto_9
    invoke-virtual {p1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_e
    iget-boolean p1, p0, Le/e0;->I:Z

    if-nez p1, :cond_f

    if-eqz v5, :cond_f

    move v1, v0

    :cond_f
    move p1, v5

    move v5, p2

    goto :goto_a

    :cond_10
    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz p1, :cond_11

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move p1, v0

    goto :goto_a

    :cond_11
    move p1, v0

    move v5, p1

    :goto_a
    if-eqz v5, :cond_13

    iget-object p2, p0, Le/e0;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p2, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_b

    :cond_12
    move p1, v0

    :cond_13
    :goto_b
    iget-object p2, p0, Le/e0;->D:Landroid/view/View;

    if-eqz p2, :cond_15

    if-eqz p1, :cond_14

    goto :goto_c

    :cond_14
    move v0, v3

    :goto_c
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_15
    return v1
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, Le/e0;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    instance-of v0, v0, Le/e0;

    if-nez v0, :cond_1

    const-string v0, "AppCompatDelegate"

    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Le/e0;->p:Le/s0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Le/e0;->A()V

    iget-object v0, p0, Le/e0;->p:Le/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Le/e0;->B(I)V

    :cond_0
    return-void
.end method

.method public final d(Lh/o;)V
    .locals 5

    iget-object p1, p0, Le/e0;->s:Li/r1;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_5

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast p1, Li/x3;

    iget-object p1, p1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_5

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p1, :cond_5

    iget-boolean p1, p1, Landroidx/appcompat/widget/ActionMenuView;->t:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Le/e0;->l:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le/e0;->s:Li/r1;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast p1, Li/x3;

    iget-object p1, p1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p1, :cond_5

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->u:Li/m;

    if-eqz p1, :cond_5

    iget-object v2, p1, Li/m;->v:Li/j;

    if-nez v2, :cond_0

    invoke-virtual {p1}, Li/m;->h()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_0
    iget-object p1, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p1

    iget-object v2, p0, Le/e0;->s:Li/r1;

    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast v2, Li/x3;

    iget-object v2, v2, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v2, :cond_1

    iget-object v2, v2, Landroidx/appcompat/widget/ActionMenuView;->u:Li/m;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Li/m;->h()Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    const/16 v3, 0x6c

    if-eqz v2, :cond_3

    iget-object v1, p0, Le/e0;->s:Li/r1;

    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v1, v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast v1, Li/x3;

    iget-object v1, v1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v1, :cond_2

    iget-object v1, v1, Landroidx/appcompat/widget/ActionMenuView;->u:Li/m;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Li/m;->f()Z

    move-result v1

    :cond_2
    iget-boolean v1, p0, Le/e0;->R:Z

    if-nez v1, :cond_6

    invoke-virtual {p0, v0}, Le/e0;->z(I)Le/d0;

    move-result-object v0

    iget-object v0, v0, Le/d0;->h:Lh/o;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_6

    iget-boolean v2, p0, Le/e0;->R:Z

    if-nez v2, :cond_6

    iget-boolean v2, p0, Le/e0;->Z:Z

    if-eqz v2, :cond_4

    iget v2, p0, Le/e0;->a0:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_4

    iget-object v1, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Le/e0;->b0:Le/s;

    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v2}, Le/s;->run()V

    :cond_4
    invoke-virtual {p0, v0}, Le/e0;->z(I)Le/d0;

    move-result-object v1

    iget-object v2, v1, Le/d0;->h:Lh/o;

    if-eqz v2, :cond_6

    iget-boolean v4, v1, Le/d0;->o:Z

    if-nez v4, :cond_6

    iget-object v4, v1, Le/d0;->g:Landroid/view/View;

    invoke-interface {p1, v0, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v1, Le/d0;->h:Lh/o;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object p1, p0, Le/e0;->s:Li/r1;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast p1, Li/x3;

    iget-object p1, p1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p1, :cond_6

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->u:Li/m;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Li/m;->l()Z

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v0}, Le/e0;->z(I)Le/d0;

    move-result-object p1

    iput-boolean v1, p1, Le/d0;->n:Z

    invoke-virtual {p0, p1, v0}, Le/e0;->s(Le/d0;Z)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Le/e0;->E(Le/d0;Landroid/view/KeyEvent;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final e(Lh/o;Landroid/view/MenuItem;)Z
    .locals 7

    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-boolean v2, p0, Le/e0;->R:Z

    if-nez v2, :cond_3

    invoke-virtual {p1}, Lh/o;->k()Lh/o;

    move-result-object p1

    iget-object v2, p0, Le/e0;->M:[Le/d0;

    if-eqz v2, :cond_0

    array-length v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    if-eqz v5, :cond_1

    iget-object v6, v5, Le/d0;->h:Lh/o;

    if-ne v6, p1, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_3

    iget p1, v5, Le/d0;->a:I

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public final f()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Le/e0;->P:Z

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Le/e0;->n(ZZ)Z

    invoke-virtual {p0}, Le/e0;->x()V

    iget-object v1, p0, Le/e0;->k:Ljava/lang/Object;

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_2

    :try_start_0
    check-cast v1, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v2

    invoke-static {v1, v2}, Lr3/q;->k(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Le/e0;->p:Le/s0;

    if-nez v1, :cond_0

    iput-boolean v0, p0, Le/e0;->c0:Z

    goto :goto_1

    :cond_0
    invoke-virtual {v1, v0}, Le/s0;->T2(Z)V

    :cond_1
    :goto_1
    sget-object v1, Le/r;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_3
    invoke-static {p0}, Le/r;->h(Le/r;)V

    sget-object v2, Le/r;->h:Ln/c;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ln/c;->add(Ljava/lang/Object;)Z

    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_2
    :goto_2
    new-instance v1, Landroid/content/res/Configuration;

    iget-object v2, p0, Le/e0;->l:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v1, p0, Le/e0;->S:Landroid/content/res/Configuration;

    iput-boolean v0, p0, Le/e0;->Q:Z

    return-void
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Le/e0;->k:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    sget-object v0, Le/r;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Le/r;->h(Le/r;)V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    :goto_0
    iget-boolean v0, p0, Le/e0;->Z:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Le/e0;->b0:Le/s;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Le/e0;->R:Z

    iget v0, p0, Le/e0;->T:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Le/e0;->k:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Le/e0;->i0:Ln/k;

    iget-object v1, p0, Le/e0;->k:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Le/e0;->T:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    sget-object v0, Le/e0;->i0:Ln/k;

    iget-object v1, p0, Le/e0;->k:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget-object v0, p0, Le/e0;->X:Le/z;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Le/b0;->a()V

    :cond_3
    iget-object v0, p0, Le/e0;->Y:Le/z;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Le/b0;->a()V

    :cond_4
    return-void
.end method

.method public final i(I)Z
    .locals 5

    const/16 v0, 0x6d

    const/16 v1, 0x6c

    const/16 v2, 0x8

    const-string v3, "AppCompatDelegate"

    if-ne p1, v2, :cond_0

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move p1, v1

    goto :goto_0

    :cond_0
    const/16 v2, 0x9

    if-ne p1, v2, :cond_1

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move p1, v0

    :cond_1
    :goto_0
    iget-boolean v2, p0, Le/e0;->K:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    if-ne p1, v1, :cond_2

    return v3

    :cond_2
    iget-boolean v2, p0, Le/e0;->G:Z

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-ne p1, v4, :cond_3

    iput-boolean v3, p0, Le/e0;->G:Z

    :cond_3
    if-eq p1, v4, :cond_9

    const/4 v2, 0x2

    if-eq p1, v2, :cond_8

    const/4 v2, 0x5

    if-eq p1, v2, :cond_7

    const/16 v2, 0xa

    if-eq p1, v2, :cond_6

    if-eq p1, v1, :cond_5

    if-eq p1, v0, :cond_4

    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result p1

    return p1

    :cond_4
    invoke-virtual {p0}, Le/e0;->H()V

    iput-boolean v4, p0, Le/e0;->H:Z

    return v4

    :cond_5
    invoke-virtual {p0}, Le/e0;->H()V

    iput-boolean v4, p0, Le/e0;->G:Z

    return v4

    :cond_6
    invoke-virtual {p0}, Le/e0;->H()V

    iput-boolean v4, p0, Le/e0;->I:Z

    return v4

    :cond_7
    invoke-virtual {p0}, Le/e0;->H()V

    iput-boolean v4, p0, Le/e0;->F:Z

    return v4

    :cond_8
    invoke-virtual {p0}, Le/e0;->H()V

    iput-boolean v4, p0, Le/e0;->E:Z

    return v4

    :cond_9
    invoke-virtual {p0}, Le/e0;->H()V

    iput-boolean v4, p0, Le/e0;->K:Z

    return v4
.end method

.method public final j(I)V
    .locals 2

    invoke-virtual {p0}, Le/e0;->w()V

    iget-object v0, p0, Le/e0;->B:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v1, p0, Le/e0;->l:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object p1, p0, Le/e0;->n:Le/y;

    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/y;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final k(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Le/e0;->w()V

    iget-object v0, p0, Le/e0;->B:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Le/e0;->n:Le/y;

    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/y;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final l(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Le/e0;->w()V

    iget-object v0, p0, Le/e0;->B:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Le/e0;->n:Le/y;

    iget-object p2, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/y;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final m(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Le/e0;->r:Ljava/lang/CharSequence;

    iget-object v0, p0, Le/e0;->s:Li/r1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Li/r1;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/e0;->p:Le/s0;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Le/s0;->V2(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Le/e0;->C:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final n(ZZ)Z
    .locals 12

    iget-boolean v0, p0, Le/e0;->R:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Le/e0;->T:I

    const/16 v2, -0x64

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    sget v0, Le/r;->c:I

    :goto_0
    iget-object v2, p0, Le/e0;->l:Landroid/content/Context;

    invoke-virtual {p0, v2, v0}, Le/e0;->C(Landroid/content/Context;I)I

    move-result v3

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x21

    const/4 v6, 0x0

    if-ge v4, v5, :cond_2

    invoke-static {v2}, Le/e0;->p(Landroid/content/Context;)Le0/h;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v6

    :goto_1
    if-nez p2, :cond_3

    if-eqz v5, :cond_3

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p2

    invoke-static {p2}, Le/w;->b(Landroid/content/res/Configuration;)Le0/h;

    move-result-object v5

    :cond_3
    invoke-static {v2, v3, v5, v6, v1}, Le/e0;->t(Landroid/content/Context;ILe0/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object p2

    iget-boolean v3, p0, Le/e0;->W:Z

    const/4 v7, 0x1

    iget-object v8, p0, Le/e0;->k:Ljava/lang/Object;

    if-nez v3, :cond_6

    instance-of v3, v8, Landroid/app/Activity;

    if-eqz v3, :cond_6

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    const/16 v9, 0x1d

    if-lt v4, v9, :cond_5

    const/high16 v4, 0x100c0000

    goto :goto_2

    :cond_5
    const/high16 v4, 0xc0000

    :goto_2
    :try_start_0
    new-instance v9, Landroid/content/ComponentName;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-direct {v9, v2, v10}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v3, v9, v4}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v3

    if-eqz v3, :cond_6

    iget v3, v3, Landroid/content/pm/ActivityInfo;->configChanges:I

    iput v3, p0, Le/e0;->V:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v3

    const-string v4, "AppCompatDelegate"

    const-string v9, "Exception while getting ActivityInfo"

    invoke-static {v4, v9, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput v1, p0, Le/e0;->V:I

    :cond_6
    :goto_3
    iput-boolean v7, p0, Le/e0;->W:Z

    iget v3, p0, Le/e0;->V:I

    :goto_4
    iget-object v4, p0, Le/e0;->S:Landroid/content/res/Configuration;

    if-nez v4, :cond_7

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    :cond_7
    iget v9, v4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v9, v9, 0x30

    iget v10, p2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v10, v10, 0x30

    invoke-static {v4}, Le/w;->b(Landroid/content/res/Configuration;)Le0/h;

    move-result-object v4

    if-nez v5, :cond_8

    move-object p2, v6

    goto :goto_5

    :cond_8
    invoke-static {p2}, Le/w;->b(Landroid/content/res/Configuration;)Le0/h;

    move-result-object p2

    :goto_5
    if-eq v9, v10, :cond_9

    const/16 v5, 0x200

    goto :goto_6

    :cond_9
    move v5, v1

    :goto_6
    if-eqz p2, :cond_a

    invoke-virtual {v4, p2}, Le0/h;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    or-int/lit16 v5, v5, 0x2004

    :cond_a
    not-int v4, v3

    and-int/2addr v4, v5

    const/4 v9, 0x4

    if-eqz v4, :cond_d

    if-eqz p1, :cond_d

    iget-boolean p1, p0, Le/e0;->P:Z

    if-eqz p1, :cond_d

    sget-boolean p1, Le/e0;->k0:Z

    if-nez p1, :cond_b

    iget-boolean p1, p0, Le/e0;->Q:Z

    if-eqz p1, :cond_d

    :cond_b
    instance-of p1, v8, Landroid/app/Activity;

    if-eqz p1, :cond_d

    move-object p1, v8

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->isChild()Z

    move-result v4

    if-nez v4, :cond_d

    sget v4, Ly/e;->b:I

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x1c

    if-lt v4, v11, :cond_c

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    goto :goto_7

    :cond_c
    new-instance v4, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v11

    invoke-direct {v4, v11}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v11, Landroidx/activity/d;

    invoke-direct {v11, v9, p1}, Landroidx/activity/d;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_7
    move p1, v7

    goto :goto_8

    :cond_d
    move p1, v1

    :goto_8
    if-nez p1, :cond_12

    if-eqz v5, :cond_12

    and-int p1, v5, v3

    if-ne p1, v5, :cond_e

    move v1, v7

    :cond_e
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    new-instance v3, Landroid/content/res/Configuration;

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, -0x31

    or-int/2addr v4, v10

    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    if-eqz p2, :cond_f

    invoke-static {v3, p2}, Le/w;->d(Landroid/content/res/Configuration;Le0/h;)V

    :cond_f
    invoke-virtual {p1, v3, v6}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    iget p1, p0, Le/e0;->U:I

    if-eqz p1, :cond_10

    invoke-virtual {v2, p1}, Landroid/content/Context;->setTheme(I)V

    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    iget v4, p0, Le/e0;->U:I

    invoke-virtual {p1, v4, v7}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_10
    if-eqz v1, :cond_13

    instance-of p1, v8, Landroid/app/Activity;

    if-eqz p1, :cond_13

    move-object p1, v8

    check-cast p1, Landroid/app/Activity;

    instance-of v1, p1, Landroidx/lifecycle/r;

    if-eqz v1, :cond_11

    move-object v1, p1

    check-cast v1, Landroidx/lifecycle/r;

    invoke-interface {v1}, Landroidx/lifecycle/r;->t()Landroidx/lifecycle/t;

    move-result-object v1

    iget-object v1, v1, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    sget-object v4, Landroidx/lifecycle/m;->d:Landroidx/lifecycle/m;

    invoke-virtual {v1, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_13

    invoke-virtual {p1, v3}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_9

    :cond_11
    iget-boolean v1, p0, Le/e0;->Q:Z

    if-eqz v1, :cond_13

    iget-boolean v1, p0, Le/e0;->R:Z

    if-nez v1, :cond_13

    invoke-virtual {p1, v3}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_9

    :cond_12
    move v7, p1

    :cond_13
    :goto_9
    if-eqz v7, :cond_15

    instance-of p1, v8, Le/m;

    if-eqz p1, :cond_15

    and-int/lit16 p1, v5, 0x200

    if-eqz p1, :cond_14

    move-object p1, v8

    check-cast p1, Le/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_14
    and-int/lit8 p1, v5, 0x4

    if-eqz p1, :cond_15

    check-cast v8, Le/m;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_15
    if-eqz v7, :cond_16

    if-eqz p2, :cond_16

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-static {p1}, Le/w;->b(Landroid/content/res/Configuration;)Le0/h;

    move-result-object p1

    invoke-static {p1}, Le/w;->c(Le0/h;)V

    :cond_16
    if-nez v0, :cond_17

    invoke-virtual {p0, v2}, Le/e0;->y(Landroid/content/Context;)Le/b0;

    move-result-object p1

    invoke-virtual {p1}, Le/b0;->g()V

    goto :goto_a

    :cond_17
    iget-object p1, p0, Le/e0;->X:Le/z;

    if-eqz p1, :cond_18

    invoke-virtual {p1}, Le/b0;->a()V

    :cond_18
    :goto_a
    const/4 p1, 0x3

    if-ne v0, p1, :cond_1a

    iget-object p1, p0, Le/e0;->Y:Le/z;

    if-nez p1, :cond_19

    new-instance p1, Le/z;

    invoke-direct {p1, p0, v2}, Le/z;-><init>(Le/e0;Landroid/content/Context;)V

    iput-object p1, p0, Le/e0;->Y:Le/z;

    :cond_19
    iget-object p1, p0, Le/e0;->Y:Le/z;

    invoke-virtual {p1}, Le/b0;->g()V

    goto :goto_b

    :cond_1a
    iget-object p1, p0, Le/e0;->Y:Le/z;

    if-eqz p1, :cond_1b

    invoke-virtual {p1}, Le/b0;->a()V

    :cond_1b
    :goto_b
    return v7
.end method

.method public final o(Landroid/view/Window;)V
    .locals 4

    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    const-string v1, "AppCompat has already installed itself into the Window"

    if-nez v0, :cond_5

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v2, v0, Le/y;

    if-nez v2, :cond_4

    new-instance v1, Le/y;

    invoke-direct {v1, p0, v0}, Le/y;-><init>(Le/e0;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Le/e0;->n:Le/y;

    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    sget-object v0, Le/e0;->j0:[I

    new-instance v1, Le/c;

    iget-object v2, p0, Le/e0;->l:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Le/c;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Le/c;->i(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {v1}, Le/c;->v()V

    iput-object p1, p0, Le/e0;->m:Landroid/view/Window;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_3

    iget-object p1, p0, Le/e0;->g0:Landroid/window/OnBackInvokedDispatcher;

    if-nez p1, :cond_3

    if-eqz p1, :cond_1

    iget-object v0, p0, Le/e0;->h0:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_1

    invoke-static {p1, v0}, Le/x;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v3, p0, Le/e0;->h0:Landroid/window/OnBackInvokedCallback;

    :cond_1
    iget-object p1, p0, Le/e0;->k:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Le/x;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    iput-object p1, p0, Le/e0;->g0:Landroid/window/OnBackInvokedDispatcher;

    goto :goto_0

    :cond_2
    iput-object v3, p0, Le/e0;->g0:Landroid/window/OnBackInvokedDispatcher;

    :goto_0
    invoke-virtual {p0}, Le/e0;->I()V

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    iget-object p1, p0, Le/e0;->f0:Le/h0;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    sget-object p1, Ld/a;->j:[I

    iget-object v1, p0, Le/e0;->l:Landroid/content/Context;

    .line 1
    invoke-virtual {v1, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 v2, 0x74

    .line 2
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    .line 3
    new-instance p1, Le/h0;

    invoke-direct {p1}, Le/h0;-><init>()V

    iput-object p1, p0, Le/e0;->f0:Le/h0;

    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    new-array v2, v0, [Ljava/lang/Class;

    .line 5
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    new-array v2, v0, [Ljava/lang/Object;

    .line 6
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/h0;

    iput-object v1, p0, Le/e0;->f0:Le/h0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to instantiate custom view inflater "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Falling back to default."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "AppCompatDelegate"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 8
    new-instance p1, Le/h0;

    invoke-direct {p1}, Le/h0;-><init>()V

    iput-object p1, p0, Le/e0;->f0:Le/h0;

    :cond_1
    :goto_0
    iget-object p1, p0, Le/e0;->f0:Le/h0;

    .line 9
    sget v1, Li/z3;->a:I

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ld/a;->y:[I

    .line 11
    invoke-virtual {p3, p4, v1, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    const/4 v2, 0x4

    .line 12
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_2

    const-string v4, "AppCompatViewInflater"

    const-string v5, "app:theme is now deprecated. Please move to using android:theme instead."

    .line 13
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    :cond_2
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v3, :cond_4

    .line 15
    instance-of v1, p3, Lg/f;

    if-eqz v1, :cond_3

    move-object v1, p3

    check-cast v1, Lg/f;

    .line 16
    iget v1, v1, Lg/f;->a:I

    if-eq v1, v3, :cond_4

    .line 17
    :cond_3
    new-instance v1, Lg/f;

    invoke-direct {v1, p3, v3}, Lg/f;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_4
    move-object v1, p3

    .line 18
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, -0x1

    sparse-switch v3, :sswitch_data_0

    :goto_2
    move v2, v6

    goto/16 :goto_3

    :sswitch_0
    const-string v2, "Button"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    const/16 v2, 0xd

    goto/16 :goto_3

    :sswitch_1
    const-string v2, "EditText"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    const/16 v2, 0xc

    goto/16 :goto_3

    :sswitch_2
    const-string v2, "CheckBox"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    const/16 v2, 0xb

    goto/16 :goto_3

    :sswitch_3
    const-string v2, "AutoCompleteTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_8
    const/16 v2, 0xa

    goto/16 :goto_3

    :sswitch_4
    const-string v2, "ImageView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_2

    :cond_9
    const/16 v2, 0x9

    goto/16 :goto_3

    :sswitch_5
    const-string v2, "ToggleButton"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_2

    :cond_a
    const/16 v2, 0x8

    goto/16 :goto_3

    :sswitch_6
    const-string v2, "RadioButton"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_2

    :cond_b
    const/4 v2, 0x7

    goto :goto_3

    :sswitch_7
    const-string v2, "Spinner"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_2

    :cond_c
    const/4 v2, 0x6

    goto :goto_3

    :sswitch_8
    const-string v2, "SeekBar"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_2

    :cond_d
    const/4 v2, 0x5

    goto :goto_3

    :sswitch_9
    const-string v3, "ImageButton"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_2

    :sswitch_a
    const-string v2, "TextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_2

    :cond_e
    move v2, v4

    goto :goto_3

    :sswitch_b
    const-string v2, "MultiAutoCompleteTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_2

    :cond_f
    const/4 v2, 0x2

    goto :goto_3

    :sswitch_c
    const-string v2, "CheckedTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_2

    :cond_10
    move v2, v5

    goto :goto_3

    :sswitch_d
    const-string v2, "RatingBar"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto/16 :goto_2

    :cond_11
    move v2, v0

    :cond_12
    :goto_3
    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    move-object v2, v3

    goto :goto_4

    .line 19
    :pswitch_0
    invoke-virtual {p1, v1, p4}, Le/h0;->b(Landroid/content/Context;Landroid/util/AttributeSet;)Li/s;

    move-result-object v2

    .line 20
    invoke-virtual {p1, v2, p2}, Le/h0;->g(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_4

    .line 21
    :pswitch_1
    new-instance v2, Li/z;

    .line 22
    invoke-direct {v2, v1, p4}, Li/z;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 23
    :pswitch_2
    invoke-virtual {p1, v1, p4}, Le/h0;->c(Landroid/content/Context;Landroid/util/AttributeSet;)Li/t;

    move-result-object v2

    .line 24
    invoke-virtual {p1, v2, p2}, Le/h0;->g(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_4

    .line 25
    :pswitch_3
    invoke-virtual {p1, v1, p4}, Le/h0;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Li/q;

    move-result-object v2

    .line 26
    invoke-virtual {p1, v2, p2}, Le/h0;->g(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_4

    .line 27
    :pswitch_4
    new-instance v2, Li/e0;

    .line 28
    invoke-direct {v2, v1, p4, v0}, Li/e0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_4

    .line 29
    :pswitch_5
    new-instance v2, Li/p1;

    invoke-direct {v2, v1, p4}, Li/p1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 30
    :pswitch_6
    invoke-virtual {p1, v1, p4}, Le/h0;->d(Landroid/content/Context;Landroid/util/AttributeSet;)Li/i0;

    move-result-object v2

    .line 31
    invoke-virtual {p1, v2, p2}, Le/h0;->g(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_4

    .line 32
    :pswitch_7
    new-instance v2, Li/w0;

    invoke-direct {v2, v1, p4}, Li/w0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 33
    :pswitch_8
    new-instance v2, Li/l0;

    invoke-direct {v2, v1, p4}, Li/l0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 34
    :pswitch_9
    new-instance v2, Li/c0;

    const v7, 0x7f030230

    .line 35
    invoke-direct {v2, v1, p4, v7}, Li/c0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_4

    .line 36
    :pswitch_a
    invoke-virtual {p1, v1, p4}, Le/h0;->e(Landroid/content/Context;Landroid/util/AttributeSet;)Li/h1;

    move-result-object v2

    .line 37
    invoke-virtual {p1, v2, p2}, Le/h0;->g(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_4

    .line 38
    :pswitch_b
    new-instance v2, Li/f0;

    invoke-direct {v2, v1, p4}, Li/f0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 39
    :pswitch_c
    new-instance v2, Li/u;

    invoke-direct {v2, v1, p4}, Li/u;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 40
    :pswitch_d
    new-instance v2, Li/j0;

    invoke-direct {v2, v1, p4}, Li/j0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    :goto_4
    if-nez v2, :cond_17

    if-eq p3, v1, :cond_17

    .line 41
    iget-object p3, p1, Le/h0;->a:[Ljava/lang/Object;

    const-string v2, "view"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    const-string p2, "class"

    .line 42
    invoke-interface {p4, v3, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 43
    :cond_13
    :try_start_1
    aput-object v1, p3, v0

    .line 44
    aput-object p4, p3, v5

    const/16 v2, 0x2e

    .line 45
    invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ne v6, v2, :cond_16

    move v2, v0

    .line 46
    :goto_5
    sget-object v6, Le/h0;->g:[Ljava/lang/String;

    if-ge v2, v4, :cond_15

    .line 47
    aget-object v6, v6, v2

    invoke-virtual {p1, v1, p2, v6}, Le/h0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v6, :cond_14

    .line 48
    aput-object v3, p3, v0

    .line 49
    aput-object v3, p3, v5

    move-object v3, v6

    goto :goto_7

    :cond_14
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 50
    :cond_15
    aput-object v3, p3, v0

    .line 51
    aput-object v3, p3, v5

    goto :goto_7

    .line 52
    :cond_16
    :try_start_2
    invoke-virtual {p1, v1, p2, v3}, Le/h0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    aput-object v3, p3, v0

    .line 54
    aput-object v3, p3, v5

    move-object v3, p1

    goto :goto_7

    .line 55
    :goto_6
    aput-object v3, p3, v0

    .line 56
    aput-object v3, p3, v5

    .line 57
    throw p1

    .line 58
    :catch_0
    aput-object v3, p3, v0

    .line 59
    aput-object v3, p3, v5

    :goto_7
    move-object v2, v3

    :cond_17
    if-eqz v2, :cond_1f

    .line 60
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 61
    instance-of p2, p1, Landroid/content/ContextWrapper;

    if-eqz p2, :cond_1a

    .line 62
    sget-object p2, Li0/v0;->a:Ljava/util/WeakHashMap;

    .line 63
    invoke-static {v2}, Li0/d0;->a(Landroid/view/View;)Z

    move-result p2

    if-nez p2, :cond_18

    goto :goto_8

    .line 64
    :cond_18
    sget-object p2, Le/h0;->c:[I

    invoke-virtual {p1, p4, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 65
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_19

    .line 66
    new-instance p3, Le/g0;

    invoke-direct {p3, v2, p2}, Le/g0;-><init>(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    :cond_19
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1a
    :goto_8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1c

    if-le p1, p2, :cond_1b

    goto :goto_9

    .line 68
    :cond_1b
    sget-object p1, Le/h0;->d:[I

    invoke-virtual {v1, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 69
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1c

    .line 70
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    sget-object p3, Li0/v0;->a:Ljava/util/WeakHashMap;

    .line 71
    new-instance p3, Li0/a0;

    const v3, 0x7f0801b7

    invoke-direct {p3, v3, v4}, Li0/a0;-><init>(II)V

    .line 72
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p3, v2, p2}, Li0/c0;->b(Landroid/view/View;Ljava/lang/Object;)V

    .line 73
    :cond_1c
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    sget-object p1, Le/h0;->e:[I

    invoke-virtual {v1, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 75
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1d

    .line 76
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Li0/v0;->m(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 77
    :cond_1d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 78
    sget-object p1, Le/h0;->f:[I

    invoke-virtual {v1, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 79
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1e

    .line 80
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 81
    sget-object p3, Li0/v0;->a:Ljava/util/WeakHashMap;

    .line 82
    new-instance p3, Li0/a0;

    const p4, 0x7f0801bc

    invoke-direct {p3, p4, v0}, Li0/a0;-><init>(II)V

    .line 83
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p3, v2, p2}, Li0/c0;->b(Landroid/view/View;Ljava/lang/Object;)V

    .line 84
    :cond_1e
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1f
    :goto_9
    return-object v2

    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_d
        -0x56c015e7 -> :sswitch_c
        -0x503aa7ad -> :sswitch_b
        -0x37f7066e -> :sswitch_a
        -0x37e04bb3 -> :sswitch_9
        -0x274065a5 -> :sswitch_8
        -0x1440b607 -> :sswitch_7
        0x2e46a6ed -> :sswitch_6
        0x2fa453c6 -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 85
    invoke-virtual {p0, v0, p1, p2, p3}, Le/e0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final q(ILe/d0;Lh/o;)V
    .locals 3

    if-nez p3, :cond_1

    if-nez p2, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Le/e0;->M:[Le/d0;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object p2, v0, p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p3, p2, Le/d0;->h:Lh/o;

    :cond_1
    if-eqz p2, :cond_2

    iget-boolean p2, p2, Le/d0;->m:Z

    if-nez p2, :cond_2

    return-void

    :cond_2
    iget-boolean p2, p0, Le/e0;->R:Z

    if-nez p2, :cond_3

    iget-object p2, p0, Le/e0;->n:Le/y;

    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    iput-boolean v1, p2, Le/y;->e:Z

    invoke-interface {v0, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, p2, Le/y;->e:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v2, p2, Le/y;->e:Z

    throw p1

    :cond_3
    :goto_0
    return-void
.end method

.method public final r(Lh/o;)V
    .locals 2

    iget-boolean v0, p0, Le/e0;->L:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Le/e0;->L:Z

    iget-object v0, p0, Le/e0;->s:Li/r1;

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast v0, Li/x3;

    iget-object v0, v0, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->u:Li/m;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Li/m;->f()Z

    iget-object v0, v0, Li/m;->u:Li/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lh/a0;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lh/a0;->j:Lh/x;

    invoke-interface {v0}, Lh/g0;->dismiss()V

    :cond_1
    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Le/e0;->R:Z

    if-nez v1, :cond_2

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Le/e0;->L:Z

    return-void
.end method

.method public final s(Le/d0;Z)V
    .locals 3

    if-eqz p2, :cond_0

    iget v0, p1, Le/d0;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Le/e0;->s:Li/r1;

    if-eqz v0, :cond_0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast v0, Li/x3;

    iget-object v0, v0, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->u:Li/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li/m;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Le/d0;->h:Lh/o;

    invoke-virtual {p0, p1}, Le/e0;->r(Lh/o;)V

    return-void

    :cond_0
    iget-object v0, p0, Le/e0;->l:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v2, p1, Le/d0;->m:Z

    if-eqz v2, :cond_1

    iget-object v2, p1, Le/d0;->e:Le/c0;

    if-eqz v2, :cond_1

    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    iget p2, p1, Le/d0;->a:I

    invoke-virtual {p0, p2, p1, v1}, Le/e0;->q(ILe/d0;Lh/o;)V

    :cond_1
    const/4 p2, 0x0

    iput-boolean p2, p1, Le/d0;->k:Z

    iput-boolean p2, p1, Le/d0;->l:Z

    iput-boolean p2, p1, Le/d0;->m:Z

    iput-object v1, p1, Le/d0;->f:Landroid/view/View;

    const/4 p2, 0x1

    iput-boolean p2, p1, Le/d0;->n:Z

    iget-object p2, p0, Le/e0;->N:Le/d0;

    if-ne p2, p1, :cond_2

    iput-object v1, p0, Le/e0;->N:Le/d0;

    :cond_2
    iget p1, p1, Le/d0;->a:I

    if-nez p1, :cond_3

    invoke-virtual {p0}, Le/e0;->I()V

    :cond_3
    return-void
.end method

.method public final u(Landroid/view/KeyEvent;)Z
    .locals 6

    iget-object v0, p0, Le/e0;->k:Ljava/lang/Object;

    instance-of v1, v0, Li0/l;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    instance-of v0, v0, Le/j;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Lc3/h;->G0(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x0

    const/16 v3, 0x52

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Le/e0;->n:Le/y;

    iget-object v4, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iput-boolean v2, v0, Le/y;->d:Z

    invoke-interface {v4, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, v0, Le/y;->d:Z

    if-eqz v4, :cond_2

    return v2

    :catchall_0
    move-exception p1

    iput-boolean v1, v0, Le/y;->d:Z

    throw p1

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v4

    const/4 v5, 0x4

    if-nez v4, :cond_7

    if-eq v0, v5, :cond_4

    if-eq v0, v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_11

    invoke-virtual {p0, v1}, Le/e0;->z(I)Le/d0;

    move-result-object v0

    iget-boolean v1, v0, Le/d0;->m:Z

    if-nez v1, :cond_11

    invoke-virtual {p0, v0, p1}, Le/e0;->G(Le/d0;Landroid/view/KeyEvent;)Z

    goto/16 :goto_4

    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    move-result p1

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    move v2, v1

    :goto_0
    iput-boolean v2, p0, Le/e0;->O:Z

    :cond_6
    :goto_1
    move v2, v1

    goto/16 :goto_4

    :cond_7
    if-eq v0, v5, :cond_10

    if-eq v0, v3, :cond_8

    goto :goto_1

    :cond_8
    iget-object v0, p0, Le/e0;->v:Lg/c;

    if-eqz v0, :cond_9

    goto/16 :goto_4

    :cond_9
    invoke-virtual {p0, v1}, Le/e0;->z(I)Le/d0;

    move-result-object v0

    iget-object v3, p0, Le/e0;->s:Li/r1;

    iget-object v4, p0, Le/e0;->l:Landroid/content/Context;

    if-eqz v3, :cond_b

    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast v3, Li/x3;

    iget-object v3, v3, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-nez v5, :cond_b

    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v3, :cond_b

    iget-boolean v3, v3, Landroidx/appcompat/widget/ActionMenuView;->t:Z

    if-eqz v3, :cond_b

    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v3

    if-nez v3, :cond_b

    iget-object v3, p0, Le/e0;->s:Li/r1;

    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast v3, Li/x3;

    iget-object v3, v3, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v3, :cond_a

    iget-object v3, v3, Landroidx/appcompat/widget/ActionMenuView;->u:Li/m;

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Li/m;->h()Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object p1, p0, Le/e0;->s:Li/r1;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast p1, Li/x3;

    iget-object p1, p1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p1, :cond_11

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->u:Li/m;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Li/m;->f()Z

    move-result p1

    if-eqz p1, :cond_11

    goto :goto_3

    :cond_a
    iget-boolean v3, p0, Le/e0;->R:Z

    if-nez v3, :cond_11

    invoke-virtual {p0, v0, p1}, Le/e0;->G(Le/d0;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_11

    iget-object p1, p0, Le/e0;->s:Li/r1;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/s1;

    check-cast p1, Li/x3;

    iget-object p1, p1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p1, :cond_11

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->u:Li/m;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Li/m;->l()Z

    move-result p1

    if-eqz p1, :cond_11

    goto :goto_3

    :cond_b
    iget-boolean v3, v0, Le/d0;->m:Z

    if-nez v3, :cond_e

    iget-boolean v5, v0, Le/d0;->l:Z

    if-eqz v5, :cond_c

    goto :goto_2

    :cond_c
    iget-boolean v3, v0, Le/d0;->k:Z

    if-eqz v3, :cond_11

    iget-boolean v3, v0, Le/d0;->o:Z

    if-eqz v3, :cond_d

    iput-boolean v1, v0, Le/d0;->k:Z

    invoke-virtual {p0, v0, p1}, Le/e0;->G(Le/d0;Landroid/view/KeyEvent;)Z

    move-result v3

    if-eqz v3, :cond_11

    :cond_d
    invoke-virtual {p0, v0, p1}, Le/e0;->E(Le/d0;Landroid/view/KeyEvent;)V

    goto :goto_3

    :cond_e
    :goto_2
    invoke-virtual {p0, v0, v2}, Le/e0;->s(Le/d0;Z)V

    if-eqz v3, :cond_11

    :goto_3
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    if-eqz p1, :cond_f

    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    goto :goto_4

    :cond_f
    const-string p1, "AppCompatDelegate"

    const-string v0, "Couldn\'t get audio manager"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_10
    invoke-virtual {p0}, Le/e0;->D()Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_11
    :goto_4
    return v2
.end method

.method public final v(I)V
    .locals 3

    invoke-virtual {p0, p1}, Le/e0;->z(I)Le/d0;

    move-result-object v0

    iget-object v1, v0, Le/d0;->h:Lh/o;

    if-eqz v1, :cond_1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Le/d0;->h:Lh/o;

    invoke-virtual {v2, v1}, Lh/o;->t(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    move-result v2

    if-lez v2, :cond_0

    iput-object v1, v0, Le/d0;->p:Landroid/os/Bundle;

    :cond_0
    iget-object v1, v0, Le/d0;->h:Lh/o;

    invoke-virtual {v1}, Lh/o;->w()V

    iget-object v1, v0, Le/d0;->h:Lh/o;

    invoke-virtual {v1}, Lh/o;->clear()V

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, v0, Le/d0;->o:Z

    iput-boolean v1, v0, Le/d0;->n:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, Le/e0;->s:Li/r1;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Le/e0;->z(I)Le/d0;

    move-result-object v0

    iput-boolean p1, v0, Le/d0;->k:Z

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Le/e0;->G(Le/d0;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method

.method public final w()V
    .locals 13

    iget-boolean v0, p0, Le/e0;->A:Z

    if-nez v0, :cond_1b

    sget-object v0, Ld/a;->j:[I

    iget-object v1, p0, Le/e0;->l:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/16 v3, 0x75

    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_1a

    const/16 v4, 0x7e

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    const/16 v6, 0x6c

    const/4 v7, 0x1

    if-eqz v4, :cond_0

    invoke-virtual {p0, v7}, Le/e0;->i(I)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, v6}, Le/e0;->i(I)Z

    :cond_1
    :goto_0
    const/16 v3, 0x76

    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    const/16 v4, 0x6d

    if-eqz v3, :cond_2

    invoke-virtual {p0, v4}, Le/e0;->i(I)Z

    :cond_2
    const/16 v3, 0x77

    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0xa

    invoke-virtual {p0, v3}, Le/e0;->i(I)Z

    :cond_3
    invoke-virtual {v2, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Le/e0;->J:Z

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Le/e0;->x()V

    iget-object v2, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    iget-boolean v3, p0, Le/e0;->K:Z

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-nez v3, :cond_9

    iget-boolean v3, p0, Le/e0;->J:Z

    if-eqz v3, :cond_4

    const v3, 0x7f0b000c

    invoke-virtual {v2, v3, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-boolean v5, p0, Le/e0;->H:Z

    iput-boolean v5, p0, Le/e0;->G:Z

    goto/16 :goto_2

    :cond_4
    iget-boolean v2, p0, Le/e0;->G:Z

    if-eqz v2, :cond_8

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    const v10, 0x7f03000b

    invoke-virtual {v3, v10, v2, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v3, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v3, :cond_5

    new-instance v3, Lg/f;

    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v3, v1, v2}, Lg/f;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_5
    move-object v3, v1

    :goto_1
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0b0017

    invoke-virtual {v2, v3, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    const v3, 0x7f080092

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Li/r1;

    iput-object v3, p0, Le/e0;->s:Li/r1;

    iget-object v10, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v10}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v10

    invoke-interface {v3, v10}, Li/r1;->setWindowCallback(Landroid/view/Window$Callback;)V

    iget-boolean v3, p0, Le/e0;->H:Z

    if-eqz v3, :cond_6

    iget-object v3, p0, Le/e0;->s:Li/r1;

    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    :cond_6
    iget-boolean v3, p0, Le/e0;->E:Z

    if-eqz v3, :cond_7

    iget-object v3, p0, Le/e0;->s:Li/r1;

    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v3, v8}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    :cond_7
    iget-boolean v3, p0, Le/e0;->F:Z

    if-eqz v3, :cond_b

    iget-object v3, p0, Le/e0;->s:Li/r1;

    const/4 v4, 0x5

    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    goto :goto_2

    :cond_8
    move-object v2, v9

    goto :goto_2

    :cond_9
    iget-boolean v3, p0, Le/e0;->I:Z

    if-eqz v3, :cond_a

    const v3, 0x7f0b0016

    invoke-virtual {v2, v3, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_2

    :cond_a
    const v3, 0x7f0b0015

    invoke-virtual {v2, v3, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    :cond_b
    :goto_2
    if-eqz v2, :cond_19

    new-instance v3, Le/t;

    invoke-direct {v3, p0, v5}, Le/t;-><init>(Le/e0;I)V

    sget-object v4, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v2, v3}, Li0/k0;->u(Landroid/view/View;Li0/s;)V

    iget-object v3, p0, Le/e0;->s:Li/r1;

    if-nez v3, :cond_c

    const v3, 0x7f0801d6

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Le/e0;->C:Landroid/widget/TextView;

    :cond_c
    sget-object v3, Li/b4;->a:Ljava/lang/reflect/Method;

    const-string v3, "Could not invoke makeOptionalFitsSystemWindows"

    const-string v4, "ViewUtils"

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    const-string v11, "makeOptionalFitsSystemWindows"

    new-array v12, v5, [Ljava/lang/Class;

    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v11

    if-nez v11, :cond_d

    invoke-virtual {v10, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    goto :goto_3

    :catch_0
    move-exception v10

    goto :goto_4

    :catch_1
    move-exception v10

    goto :goto_5

    :cond_d
    :goto_3
    new-array v11, v5, [Ljava/lang/Object;

    invoke-virtual {v10, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :goto_4
    invoke-static {v4, v3, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_6

    :goto_5
    invoke-static {v4, v3, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_6

    :catch_2
    const-string v3, "Could not find method makeOptionalFitsSystemWindows. Oh well..."

    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_6
    const v3, 0x7f080034

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v4, p0, Le/e0;->m:Landroid/view/Window;

    const v10, 0x1020002

    invoke-virtual {v4, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    if-eqz v4, :cond_f

    :goto_7
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v11

    if-lez v11, :cond_e

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v3, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_7

    :cond_e
    const/4 v11, -0x1

    invoke-virtual {v4, v11}, Landroid/view/View;->setId(I)V

    invoke-virtual {v3, v10}, Landroid/view/View;->setId(I)V

    instance-of v11, v4, Landroid/widget/FrameLayout;

    if-eqz v11, :cond_f

    check-cast v4, Landroid/widget/FrameLayout;

    invoke-virtual {v4, v9}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_f
    iget-object v4, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v4, v2}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    new-instance v4, Le/t;

    invoke-direct {v4, p0, v8}, Le/t;-><init>(Le/e0;I)V

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Li/q1;)V

    iput-object v2, p0, Le/e0;->B:Landroid/view/ViewGroup;

    iget-object v2, p0, Le/e0;->k:Ljava/lang/Object;

    instance-of v3, v2, Landroid/app/Activity;

    if-eqz v3, :cond_10

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_8

    :cond_10
    iget-object v2, p0, Le/e0;->r:Ljava/lang/CharSequence;

    :goto_8
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_13

    iget-object v3, p0, Le/e0;->s:Li/r1;

    if-eqz v3, :cond_11

    invoke-interface {v3, v2}, Li/r1;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_9

    :cond_11
    iget-object v3, p0, Le/e0;->p:Le/s0;

    if-eqz v3, :cond_12

    invoke-virtual {v3, v2}, Le/s0;->V2(Ljava/lang/CharSequence;)V

    goto :goto_9

    :cond_12
    iget-object v3, p0, Le/e0;->C:Landroid/widget/TextView;

    if-eqz v3, :cond_13

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_13
    :goto_9
    iget-object v2, p0, Le/e0;->B:Landroid/view/ViewGroup;

    invoke-virtual {v2, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v3, p0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    iget-object v10, v2, Landroidx/appcompat/widget/ContentFrameLayout;->h:Landroid/graphics/Rect;

    invoke-virtual {v10, v4, v8, v9, v3}, Landroid/graphics/Rect;->set(IIII)V

    sget-object v3, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v2}, Li0/h0;->c(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    :cond_14
    invoke-virtual {v1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/16 v1, 0x7c

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    const/16 v1, 0x7d

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    const/16 v1, 0x7a

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_15
    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_16
    const/16 v1, 0x78

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_17
    const/16 v1, 0x79

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    iput-boolean v7, p0, Le/e0;->A:Z

    invoke-virtual {p0, v5}, Le/e0;->z(I)Le/d0;

    move-result-object v0

    iget-boolean v1, p0, Le/e0;->R:Z

    if-nez v1, :cond_1b

    iget-object v0, v0, Le/d0;->h:Lh/o;

    if-nez v0, :cond_1b

    invoke-virtual {p0, v6}, Le/e0;->B(I)V

    goto :goto_a

    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Le/e0;->G:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Le/e0;->H:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Le/e0;->J:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Le/e0;->I:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Le/e0;->K:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " }"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    :goto_a
    return-void
.end method

.method public final x()V
    .locals 2

    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    if-nez v0, :cond_0

    iget-object v0, p0, Le/e0;->k:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0, v0}, Le/e0;->o(Landroid/view/Window;)V

    :cond_0
    iget-object v0, p0, Le/e0;->m:Landroid/view/Window;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We have not been given a Window"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final y(Landroid/content/Context;)Le/b0;
    .locals 3

    iget-object v0, p0, Le/e0;->X:Le/z;

    if-nez v0, :cond_1

    new-instance v0, Le/z;

    sget-object v1, Le/c;->f:Le/c;

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Le/c;

    const-string v2, "location"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/location/LocationManager;

    invoke-direct {v1, p1, v2}, Le/c;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    sput-object v1, Le/c;->f:Le/c;

    :cond_0
    sget-object p1, Le/c;->f:Le/c;

    invoke-direct {v0, p0, p1}, Le/z;-><init>(Le/e0;Le/c;)V

    iput-object v0, p0, Le/e0;->X:Le/z;

    :cond_1
    iget-object p1, p0, Le/e0;->X:Le/z;

    return-object p1
.end method

.method public final z(I)Le/d0;
    .locals 4

    iget-object v0, p0, Le/e0;->M:[Le/d0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    if-gt v2, p1, :cond_2

    :cond_0
    add-int/lit8 v2, p1, 0x1

    new-array v2, v2, [Le/d0;

    if-eqz v0, :cond_1

    array-length v3, v0

    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput-object v2, p0, Le/e0;->M:[Le/d0;

    move-object v0, v2

    :cond_2
    aget-object v2, v0, p1

    if-nez v2, :cond_3

    new-instance v2, Le/d0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput p1, v2, Le/d0;->a:I

    iput-boolean v1, v2, Le/d0;->n:Z

    aput-object v2, v0, p1

    :cond_3
    return-object v2
.end method
