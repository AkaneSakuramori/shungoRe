.class public final Le/s0;
.super Lc3/h;
.source "SourceFile"

# interfaces
.implements Li/f;


# static fields
.field public static final H:Landroid/view/animation/AccelerateInterpolator;

.field public static final I:Landroid/view/animation/DecelerateInterpolator;


# instance fields
.field public A:Z

.field public B:Lg/n;

.field public C:Z

.field public D:Z

.field public final E:Le/q0;

.field public final F:Le/q0;

.field public final G:Le/n0;

.field public j:Landroid/content/Context;

.field public k:Landroid/content/Context;

.field public l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field public m:Landroidx/appcompat/widget/ActionBarContainer;

.field public n:Li/s1;

.field public o:Landroidx/appcompat/widget/ActionBarContextView;

.field public final p:Landroid/view/View;

.field public q:Z

.field public r:Le/r0;

.field public s:Le/r0;

.field public t:Lg/b;

.field public u:Z

.field public final v:Ljava/util/ArrayList;

.field public w:I

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Le/s0;->H:Landroid/view/animation/AccelerateInterpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Le/s0;->I:Landroid/view/animation/DecelerateInterpolator;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/s0;->v:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Le/s0;->w:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Le/s0;->x:Z

    iput-boolean v1, p0, Le/s0;->A:Z

    .line 4
    new-instance v2, Le/q0;

    invoke-direct {v2, p0, v0}, Le/q0;-><init>(Le/s0;I)V

    iput-object v2, p0, Le/s0;->E:Le/q0;

    .line 5
    new-instance v0, Le/q0;

    invoke-direct {v0, p0, v1}, Le/q0;-><init>(Le/s0;I)V

    iput-object v0, p0, Le/s0;->F:Le/q0;

    .line 6
    new-instance v0, Le/n0;

    invoke-direct {v0, v1, p0}, Le/n0;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Le/s0;->G:Le/n0;

    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Le/s0;->S2(Landroid/view/View;)V

    if-nez p2, :cond_0

    const p2, 0x1020002

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Le/s0;->p:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 3

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/s0;->v:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Le/s0;->w:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Le/s0;->x:Z

    iput-boolean v1, p0, Le/s0;->A:Z

    .line 14
    new-instance v2, Le/q0;

    invoke-direct {v2, p0, v0}, Le/q0;-><init>(Le/s0;I)V

    iput-object v2, p0, Le/s0;->E:Le/q0;

    .line 15
    new-instance v0, Le/q0;

    invoke-direct {v0, p0, v1}, Le/q0;-><init>(Le/s0;I)V

    iput-object v0, p0, Le/s0;->F:Le/q0;

    .line 16
    new-instance v0, Le/n0;

    invoke-direct {v0, v1, p0}, Le/n0;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Le/s0;->G:Le/n0;

    .line 17
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/s0;->S2(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final Q2(Z)V
    .locals 9

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-boolean v1, p0, Le/s0;->z:Z

    if-nez v1, :cond_3

    const/4 v1, 0x1

    iput-boolean v1, p0, Le/s0;->z:Z

    iget-object v2, p0, Le/s0;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_0
    invoke-virtual {p0, v0}, Le/s0;->W2(Z)V

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, Le/s0;->z:Z

    if-eqz v1, :cond_3

    iput-boolean v0, p0, Le/s0;->z:Z

    iget-object v1, p0, Le/s0;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_2
    invoke-virtual {p0, v0}, Le/s0;->W2(Z)V

    :cond_3
    :goto_0
    iget-object v1, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    sget-object v2, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v1}, Li0/h0;->c(Landroid/view/View;)Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x4

    if-eqz v1, :cond_7

    const-wide/16 v4, 0xc8

    const-wide/16 v6, 0x64

    if-eqz p1, :cond_4

    iget-object p1, p0, Le/s0;->n:Li/s1;

    check-cast p1, Li/x3;

    iget-object v1, p1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-static {v1}, Li0/v0;->a(Landroid/view/View;)Li0/d1;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Li0/d1;->a(F)V

    invoke-virtual {v1, v6, v7}, Li0/d1;->c(J)V

    new-instance v2, Lg/m;

    invoke-direct {v2, p1, v3}, Lg/m;-><init>(Li/x3;I)V

    invoke-virtual {v1, v2}, Li0/d1;->d(Li0/e1;)V

    iget-object p1, p0, Le/s0;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0, v4, v5}, Landroidx/appcompat/widget/ActionBarContextView;->l(IJ)Li0/d1;

    move-result-object p1

    goto :goto_1

    :cond_4
    iget-object p1, p0, Le/s0;->n:Li/s1;

    check-cast p1, Li/x3;

    iget-object v1, p1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-static {v1}, Li0/v0;->a(Landroid/view/View;)Li0/d1;

    move-result-object v1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v1, v3}, Li0/d1;->a(F)V

    invoke-virtual {v1, v4, v5}, Li0/d1;->c(J)V

    new-instance v3, Lg/m;

    invoke-direct {v3, p1, v0}, Lg/m;-><init>(Li/x3;I)V

    invoke-virtual {v1, v3}, Li0/d1;->d(Li0/e1;)V

    iget-object p1, p0, Le/s0;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2, v6, v7}, Landroidx/appcompat/widget/ActionBarContextView;->l(IJ)Li0/d1;

    move-result-object p1

    move-object v8, v1

    move-object v1, p1

    move-object p1, v8

    :goto_1
    new-instance v0, Lg/n;

    invoke-direct {v0}, Lg/n;-><init>()V

    iget-object v2, v0, Lg/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v1, Li0/d1;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->getDuration()J

    move-result-wide v3

    goto :goto_2

    :cond_5
    const-wide/16 v3, 0x0

    :goto_2
    iget-object v1, p1, Li0/d1;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    :cond_6
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lg/n;->b()V

    goto :goto_3

    :cond_7
    if-eqz p1, :cond_8

    iget-object p1, p0, Le/s0;->n:Li/s1;

    check-cast p1, Li/x3;

    iget-object p1, p1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Le/s0;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    goto :goto_3

    :cond_8
    iget-object p1, p0, Le/s0;->n:Li/s1;

    check-cast p1, Li/x3;

    iget-object p1, p1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Le/s0;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_3
    return-void
.end method

.method public final R2()Landroid/content/Context;
    .locals 4

    iget-object v0, p0, Le/s0;->k:Landroid/content/Context;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Le/s0;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x7f03000c

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget-object v2, p0, Le/s0;->j:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Le/s0;->k:Landroid/content/Context;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/s0;->j:Landroid/content/Context;

    iput-object v0, p0, Le/s0;->k:Landroid/content/Context;

    :cond_1
    :goto_0
    iget-object v0, p0, Le/s0;->k:Landroid/content/Context;

    return-object v0
.end method

.method public final S2(Landroid/view/View;)V
    .locals 6

    const v0, 0x7f080092

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iput-object v0, p0, Le/s0;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Li/f;)V

    :cond_0
    const v0, 0x7f080033

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Li/s1;

    if-eqz v1, :cond_1

    check-cast v0, Li/s1;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Landroidx/appcompat/widget/Toolbar;

    if-eqz v1, :cond_8

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Li/s1;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Le/s0;->n:Li/s1;

    const v0, 0x7f08003b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v0, p0, Le/s0;->o:Landroidx/appcompat/widget/ActionBarContextView;

    const v0, 0x7f080035

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActionBarContainer;

    iput-object p1, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    iget-object v0, p0, Le/s0;->n:Li/s1;

    if-eqz v0, :cond_7

    iget-object v1, p0, Le/s0;->o:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v1, :cond_7

    if-eqz p1, :cond_7

    check-cast v0, Li/x3;

    iget-object p1, v0, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Le/s0;->j:Landroid/content/Context;

    iget-object v0, p0, Le/s0;->n:Li/s1;

    check-cast v0, Li/x3;

    iget v0, v0, Li/x3;->b:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    iput-boolean v2, p0, Le/s0;->q:Z

    :cond_3
    new-instance v3, Lg/a;

    invoke-direct {v3, p1, v1}, Lg/a;-><init>(Landroid/content/Context;I)V

    iget-object p1, v3, Lg/a;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v4, 0xe

    iget-object p1, p0, Le/s0;->n:Li/s1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, v3, Lg/a;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/high16 v0, 0x7f040000

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p1

    invoke-virtual {p0, p1}, Le/s0;->U2(Z)V

    iget-object p1, p0, Le/s0;->j:Landroid/content/Context;

    sget-object v0, Ld/a;->a:[I

    const v3, 0x7f030007

    const/4 v5, 0x0

    invoke-virtual {p1, v5, v0, v3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Le/s0;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i:Z

    if-eqz v3, :cond_4

    iput-boolean v2, p0, Le/s0;->D:Z

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    const/16 v0, 0xc

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    if-eqz v0, :cond_6

    int-to-float v0, v0

    iget-object v1, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    sget-object v2, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v1, v0}, Li0/k0;->s(Landroid/view/View;F)V

    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-class v0, Le/s0;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " can only be used with a compatible window decor layout"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_9
    const-string v0, "null"

    :goto_3
    const-string v1, "Can\'t make a decor toolbar out of "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final T2(Z)V
    .locals 4

    iget-boolean v0, p0, Le/s0;->q:Z

    if-nez v0, :cond_1

    const/4 v0, 0x4

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Le/s0;->n:Li/s1;

    check-cast v1, Li/x3;

    iget v2, v1, Li/x3;->b:I

    const/4 v3, 0x1

    iput-boolean v3, p0, Le/s0;->q:Z

    and-int/2addr p1, v0

    and-int/lit8 v0, v2, -0x5

    or-int/2addr p1, v0

    invoke-virtual {v1, p1}, Li/x3;->a(I)V

    :cond_1
    return-void
.end method

.method public final U2(Z)V
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Le/s0;->n:Li/s1;

    check-cast p1, Li/x3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Li/x2;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Li/x2;)V

    iget-object p1, p0, Le/s0;->n:Li/s1;

    check-cast p1, Li/x3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    iget-object p1, p0, Le/s0;->n:Li/s1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Le/s0;->n:Li/s1;

    check-cast p1, Li/x3;

    iget-object p1, p1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setCollapsible(Z)V

    iget-object p1, p0, Le/s0;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    return-void
.end method

.method public final V2(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, Le/s0;->n:Li/s1;

    check-cast v0, Li/x3;

    iget-boolean v1, v0, Li/x3;->g:Z

    if-nez v1, :cond_0

    iput-object p1, v0, Li/x3;->h:Ljava/lang/CharSequence;

    iget v1, v0, Li/x3;->b:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_0

    iget-object v1, v0, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-boolean v0, v0, Li/x3;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1}, Li0/v0;->m(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final W2(Z)V
    .locals 11

    iget-boolean v0, p0, Le/s0;->y:Z

    iget-boolean v1, p0, Le/s0;->z:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_0

    move v0, v3

    :goto_0
    iget-object v1, p0, Le/s0;->G:Le/n0;

    iget-object v4, p0, Le/s0;->p:Landroid/view/View;

    const-wide/16 v5, 0xfa

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v0, :cond_e

    iget-boolean v0, p0, Le/s0;->A:Z

    if-nez v0, :cond_1a

    iput-boolean v2, p0, Le/s0;->A:Z

    iget-object v0, p0, Le/s0;->B:Lg/n;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lg/n;->a()V

    :cond_2
    iget-object v0, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget v0, p0, Le/s0;->w:I

    iget-object v9, p0, Le/s0;->F:Le/q0;

    const/4 v10, 0x0

    if-nez v0, :cond_c

    iget-boolean v0, p0, Le/s0;->C:Z

    if-nez v0, :cond_3

    if-eqz p1, :cond_c

    :cond_3
    iget-object v0, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v10}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    if-eqz p1, :cond_4

    filled-new-array {v3, v3}, [I

    move-result-object p1

    iget-object v3, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v3, p1}, Landroid/view/View;->getLocationInWindow([I)V

    aget p1, p1, v2

    int-to-float p1, p1

    sub-float/2addr v0, p1

    :cond_4
    iget-object p1, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    new-instance p1, Lg/n;

    invoke-direct {p1}, Lg/n;-><init>()V

    iget-object v2, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v2}, Li0/v0;->a(Landroid/view/View;)Li0/d1;

    move-result-object v2

    invoke-virtual {v2, v10}, Li0/d1;->e(F)V

    iget-object v3, v2, Li0/d1;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_6

    if-eqz v1, :cond_5

    new-instance v7, Li0/a1;

    invoke-direct {v7, v1, v3}, Li0/a1;-><init>(Le/n0;Landroid/view/View;)V

    :cond_5
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-static {v1, v7}, Li0/c1;->a(Landroid/view/ViewPropertyAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    :cond_6
    iget-boolean v1, p1, Lg/n;->e:Z

    iget-object v3, p1, Lg/n;->a:Ljava/util/ArrayList;

    if-nez v1, :cond_7

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    iget-boolean v1, p0, Le/s0;->x:Z

    if-eqz v1, :cond_8

    if-eqz v4, :cond_8

    invoke-virtual {v4, v0}, Landroid/view/View;->setTranslationY(F)V

    invoke-static {v4}, Li0/v0;->a(Landroid/view/View;)Li0/d1;

    move-result-object v0

    invoke-virtual {v0, v10}, Li0/d1;->e(F)V

    iget-boolean v1, p1, Lg/n;->e:Z

    if-nez v1, :cond_8

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    sget-object v0, Le/s0;->I:Landroid/view/animation/DecelerateInterpolator;

    iget-boolean v1, p1, Lg/n;->e:Z

    if-nez v1, :cond_9

    iput-object v0, p1, Lg/n;->c:Landroid/view/animation/Interpolator;

    :cond_9
    if-nez v1, :cond_a

    iput-wide v5, p1, Lg/n;->b:J

    :cond_a
    if-nez v1, :cond_b

    iput-object v9, p1, Lg/n;->d:Li0/e1;

    :cond_b
    iput-object p1, p0, Le/s0;->B:Lg/n;

    invoke-virtual {p1}, Lg/n;->b()V

    goto :goto_1

    :cond_c
    iget-object p1, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v8}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v10}, Landroid/view/View;->setTranslationY(F)V

    iget-boolean p1, p0, Le/s0;->x:Z

    if-eqz p1, :cond_d

    if-eqz v4, :cond_d

    invoke-virtual {v4, v10}, Landroid/view/View;->setTranslationY(F)V

    :cond_d
    invoke-virtual {v9}, Le/q0;->a()V

    :goto_1
    iget-object p1, p0, Le/s0;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1a

    sget-object v0, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Li0/i0;->c(Landroid/view/View;)V

    goto/16 :goto_2

    :cond_e
    iget-boolean v0, p0, Le/s0;->A:Z

    if-eqz v0, :cond_1a

    iput-boolean v3, p0, Le/s0;->A:Z

    iget-object v0, p0, Le/s0;->B:Lg/n;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lg/n;->a()V

    :cond_f
    iget v0, p0, Le/s0;->w:I

    iget-object v9, p0, Le/s0;->E:Le/q0;

    if-nez v0, :cond_19

    iget-boolean v0, p0, Le/s0;->C:Z

    if-nez v0, :cond_10

    if-eqz p1, :cond_19

    :cond_10
    iget-object v0, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v8}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    new-instance v0, Lg/n;

    invoke-direct {v0}, Lg/n;-><init>()V

    iget-object v8, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v8

    neg-int v8, v8

    int-to-float v8, v8

    if-eqz p1, :cond_11

    filled-new-array {v3, v3}, [I

    move-result-object p1

    iget-object v3, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v3, p1}, Landroid/view/View;->getLocationInWindow([I)V

    aget p1, p1, v2

    int-to-float p1, p1

    sub-float/2addr v8, p1

    :cond_11
    iget-object p1, p0, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {p1}, Li0/v0;->a(Landroid/view/View;)Li0/d1;

    move-result-object p1

    invoke-virtual {p1, v8}, Li0/d1;->e(F)V

    iget-object v2, p1, Li0/d1;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_13

    if-eqz v1, :cond_12

    new-instance v7, Li0/a1;

    invoke-direct {v7, v1, v2}, Li0/a1;-><init>(Le/n0;Landroid/view/View;)V

    :cond_12
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-static {v1, v7}, Li0/c1;->a(Landroid/view/ViewPropertyAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    :cond_13
    iget-boolean v1, v0, Lg/n;->e:Z

    iget-object v2, v0, Lg/n;->a:Ljava/util/ArrayList;

    if-nez v1, :cond_14

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    iget-boolean p1, p0, Le/s0;->x:Z

    if-eqz p1, :cond_15

    if-eqz v4, :cond_15

    invoke-static {v4}, Li0/v0;->a(Landroid/view/View;)Li0/d1;

    move-result-object p1

    invoke-virtual {p1, v8}, Li0/d1;->e(F)V

    iget-boolean v1, v0, Lg/n;->e:Z

    if-nez v1, :cond_15

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    sget-object p1, Le/s0;->H:Landroid/view/animation/AccelerateInterpolator;

    iget-boolean v1, v0, Lg/n;->e:Z

    if-nez v1, :cond_16

    iput-object p1, v0, Lg/n;->c:Landroid/view/animation/Interpolator;

    :cond_16
    if-nez v1, :cond_17

    iput-wide v5, v0, Lg/n;->b:J

    :cond_17
    if-nez v1, :cond_18

    iput-object v9, v0, Lg/n;->d:Li0/e1;

    :cond_18
    iput-object v0, p0, Le/s0;->B:Lg/n;

    invoke-virtual {v0}, Lg/n;->b()V

    goto :goto_2

    :cond_19
    invoke-virtual {v9}, Le/q0;->a()V

    :cond_1a
    :goto_2
    return-void
.end method
