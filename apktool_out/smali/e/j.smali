.class public final Le/j;
.super Landroidx/activity/p;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface;
.implements Le/n;


# instance fields
.field public e:Le/e0;

.field public final f:Le/f0;

.field public final g:Le/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-static {p1, p2}, Le/j;->p(Landroid/content/Context;I)I

    move-result p2

    invoke-static {p1, p2}, Le/j;->l(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroidx/activity/p;-><init>(Landroid/content/Context;I)V

    new-instance v0, Le/f0;

    invoke-direct {v0, p0}, Le/f0;-><init>(Le/j;)V

    iput-object v0, p0, Le/j;->f:Le/f0;

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    invoke-static {p1, p2}, Le/j;->l(Landroid/content/Context;I)I

    move-result p1

    move-object p2, v0

    check-cast p2, Le/e0;

    iput p1, p2, Le/e0;->U:I

    invoke-virtual {v0}, Le/r;->f()V

    new-instance p1, Le/h;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-direct {p1, p2, p0, v0}, Le/h;-><init>(Landroid/content/Context;Le/j;Landroid/view/Window;)V

    iput-object p1, p0, Le/j;->g:Le/h;

    return-void
.end method

.method public static l(Landroid/content/Context;I)I
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    const v0, 0x7f03017a

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    :cond_0
    return p1
.end method

.method public static p(Landroid/content/Context;I)I
    .locals 2

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    return p1

    :cond_0
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    const v0, 0x7f03002c

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    return p0
.end method


# virtual methods
.method public final bridge synthetic addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Le/j;->g(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final bridge synthetic b()V
    .locals 0

    return-void
.end method

.method public final bridge synthetic c()V
    .locals 0

    return-void
.end method

.method public final bridge synthetic d()V
    .locals 0

    return-void
.end method

.method public final bridge synthetic dismiss()V
    .locals 0

    invoke-virtual {p0}, Le/j;->h()V

    return-void
.end method

.method public final bridge synthetic dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p0, p1}, Le/j;->i(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic findViewById(I)Landroid/view/View;
    .locals 0

    invoke-virtual {p0, p1}, Le/j;->j(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final g(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    invoke-virtual {v0}, Le/e0;->w()V

    iget-object v1, v0, Le/e0;->B:Landroid/view/ViewGroup;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, v0, Le/e0;->n:Le/y;

    iget-object p2, v0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/y;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final h()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    invoke-virtual {v0}, Le/r;->g()V

    return-void
.end method

.method public final i(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Le/j;->f:Le/f0;

    invoke-static {v1, v0, p0, p1}, Lc3/h;->H0(Li0/l;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic invalidateOptionsMenu()V
    .locals 0

    invoke-virtual {p0}, Le/j;->m()V

    return-void
.end method

.method public final j(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    invoke-virtual {v0}, Le/e0;->w()V

    iget-object v0, v0, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final k()Le/r;
    .locals 3

    iget-object v0, p0, Le/j;->e:Le/e0;

    if-nez v0, :cond_0

    sget-object v0, Le/r;->b:Le/l0;

    new-instance v0, Le/e0;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-direct {v0, v1, v2, p0, p0}, Le/e0;-><init>(Landroid/content/Context;Landroid/view/Window;Le/n;Ljava/lang/Object;)V

    iput-object v0, p0, Le/j;->e:Le/e0;

    :cond_0
    iget-object v0, p0, Le/j;->e:Le/e0;

    return-object v0
.end method

.method public final m()V
    .locals 1

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    invoke-virtual {v0}, Le/r;->b()V

    return-void
.end method

.method public final n(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    invoke-virtual {v0}, Le/r;->a()V

    invoke-super {p0, p1}, Landroidx/activity/p;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object p1

    invoke-virtual {p1}, Le/r;->f()V

    return-void
.end method

.method public final o()V
    .locals 2

    invoke-super {p0}, Landroidx/activity/p;->onStop()V

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    check-cast v0, Le/e0;

    invoke-virtual {v0}, Le/e0;->A()V

    iget-object v0, v0, Le/e0;->p:Le/s0;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Le/s0;->C:Z

    iget-object v0, v0, Le/s0;->B:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/n;->a()V

    :cond_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 17

    invoke-virtual/range {p0 .. p1}, Le/j;->n(Landroid/os/Bundle;)V

    move-object/from16 v0, p0

    iget-object v1, v0, Le/j;->g:Le/h;

    iget-object v2, v1, Le/h;->b:Le/j;

    iget v3, v1, Le/h;->r:I

    invoke-virtual {v2, v3}, Le/j;->q(I)V

    iget-object v2, v1, Le/h;->c:Landroid/view/Window;

    const v3, 0x7f08015c

    invoke-virtual {v2, v3}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0801db

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f080084

    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f080067

    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    const v10, 0x7f08008d

    invoke-virtual {v3, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    const/high16 v10, 0x20000

    invoke-virtual {v2, v10, v10}, Landroid/view/Window;->setFlags(II)V

    const/16 v10, 0x8

    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    invoke-static {v4, v5}, Le/h;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v4

    invoke-static {v6, v7}, Le/h;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v5

    invoke-static {v8, v9}, Le/h;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v6

    const v7, 0x7f08017e

    invoke-virtual {v2, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroidx/core/widget/NestedScrollView;

    iput-object v7, v1, Le/h;->i:Landroidx/core/widget/NestedScrollView;

    const/4 v8, 0x0

    invoke-virtual {v7, v8}, Landroid/view/View;->setFocusable(Z)V

    iget-object v7, v1, Le/h;->i:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v7, v8}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    const v7, 0x102000b

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v1, Le/h;->n:Landroid/widget/TextView;

    const/4 v9, -0x1

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    iget-object v7, v1, Le/h;->i:Landroidx/core/widget/NestedScrollView;

    iget-object v11, v1, Le/h;->n:Landroid/widget/TextView;

    invoke-virtual {v7, v11}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v7, v1, Le/h;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v7, :cond_1

    iget-object v7, v1, Le/h;->i:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup;

    iget-object v11, v1, Le/h;->i:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v7, v11}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v11

    invoke-virtual {v7, v11}, Landroid/view/ViewGroup;->removeViewAt(I)V

    iget-object v12, v1, Le/h;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    new-instance v13, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v13, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v12, v11, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const v7, 0x1020019

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Button;

    iput-object v7, v1, Le/h;->f:Landroid/widget/Button;

    iget-object v11, v1, Le/h;->x:Le/b;

    invoke-virtual {v7, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v7, 0x0

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    const/4 v13, 0x1

    if-eqz v12, :cond_2

    iget-object v12, v1, Le/h;->f:Landroid/widget/Button;

    invoke-virtual {v12, v10}, Landroid/view/View;->setVisibility(I)V

    move v12, v8

    goto :goto_1

    :cond_2
    iget-object v12, v1, Le/h;->f:Landroid/widget/Button;

    invoke-virtual {v12, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v12, v1, Le/h;->f:Landroid/widget/Button;

    invoke-virtual {v12, v8}, Landroid/view/View;->setVisibility(I)V

    move v12, v13

    :goto_1
    const v14, 0x102001a

    invoke-virtual {v6, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/Button;

    iput-object v14, v1, Le/h;->g:Landroid/widget/Button;

    invoke-virtual {v14, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_3

    iget-object v14, v1, Le/h;->g:Landroid/widget/Button;

    invoke-virtual {v14, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_3
    iget-object v14, v1, Le/h;->g:Landroid/widget/Button;

    invoke-virtual {v14, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v14, v1, Le/h;->g:Landroid/widget/Button;

    invoke-virtual {v14, v8}, Landroid/view/View;->setVisibility(I)V

    or-int/lit8 v12, v12, 0x2

    :goto_2
    const v14, 0x102001b

    invoke-virtual {v6, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/Button;

    iput-object v14, v1, Le/h;->h:Landroid/widget/Button;

    invoke-virtual {v14, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_4

    iget-object v11, v1, Le/h;->h:Landroid/widget/Button;

    invoke-virtual {v11, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_4
    iget-object v11, v1, Le/h;->h:Landroid/widget/Button;

    invoke-virtual {v11, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v11, v1, Le/h;->h:Landroid/widget/Button;

    invoke-virtual {v11, v8}, Landroid/view/View;->setVisibility(I)V

    or-int/lit8 v12, v12, 0x4

    :goto_3
    new-instance v11, Landroid/util/TypedValue;

    invoke-direct {v11}, Landroid/util/TypedValue;-><init>()V

    iget-object v14, v1, Le/h;->a:Landroid/content/Context;

    invoke-virtual {v14}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v14

    const v15, 0x7f03002a

    invoke-virtual {v14, v15, v11, v13}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v11, v11, Landroid/util/TypedValue;->data:I

    const/4 v14, 0x2

    if-eqz v11, :cond_7

    const/high16 v11, 0x3f000000    # 0.5f

    if-ne v12, v13, :cond_5

    iget-object v15, v1, Le/h;->f:Landroid/widget/Button;

    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v16

    move-object/from16 v7, v16

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    iput v13, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    iput v11, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v15, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_4

    :cond_5
    if-ne v12, v14, :cond_6

    iget-object v7, v1, Le/h;->g:Landroid/widget/Button;

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    iput v13, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    iput v11, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v7, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_4

    :cond_6
    const/4 v7, 0x4

    if-ne v12, v7, :cond_7

    iget-object v7, v1, Le/h;->h:Landroid/widget/Button;

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    iput v13, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    iput v11, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v7, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_7
    :goto_4
    if-eqz v12, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v6, v10}, Landroid/view/View;->setVisibility(I)V

    :goto_5
    iget-object v7, v1, Le/h;->o:Landroid/view/View;

    const v11, 0x7f0801d8

    if-eqz v7, :cond_9

    new-instance v7, Landroid/view/ViewGroup$LayoutParams;

    const/4 v12, -0x2

    invoke-direct {v7, v9, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v12, v1, Le/h;->o:Landroid/view/View;

    invoke-virtual {v4, v12, v8, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v11}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_6

    :cond_9
    const v7, 0x1020006

    invoke-virtual {v2, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ImageView;

    iput-object v7, v1, Le/h;->l:Landroid/widget/ImageView;

    iget-object v7, v1, Le/h;->d:Ljava/lang/CharSequence;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    xor-int/2addr v7, v13

    if-eqz v7, :cond_c

    iget-boolean v7, v1, Le/h;->v:Z

    if-eqz v7, :cond_c

    const v7, 0x7f080047

    invoke-virtual {v2, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v1, Le/h;->m:Landroid/widget/TextView;

    iget-object v11, v1, Le/h;->d:Ljava/lang/CharSequence;

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v7, v1, Le/h;->j:I

    if-eqz v7, :cond_a

    iget-object v11, v1, Le/h;->l:Landroid/widget/ImageView;

    invoke-virtual {v11, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_6

    :cond_a
    iget-object v7, v1, Le/h;->k:Landroid/graphics/drawable/Drawable;

    if-eqz v7, :cond_b

    iget-object v11, v1, Le/h;->l:Landroid/widget/ImageView;

    invoke-virtual {v11, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_6

    :cond_b
    iget-object v7, v1, Le/h;->m:Landroid/widget/TextView;

    iget-object v11, v1, Le/h;->l:Landroid/widget/ImageView;

    invoke-virtual {v11}, Landroid/view/View;->getPaddingLeft()I

    move-result v11

    iget-object v12, v1, Le/h;->l:Landroid/widget/ImageView;

    invoke-virtual {v12}, Landroid/view/View;->getPaddingTop()I

    move-result v12

    iget-object v15, v1, Le/h;->l:Landroid/widget/ImageView;

    invoke-virtual {v15}, Landroid/view/View;->getPaddingRight()I

    move-result v15

    iget-object v14, v1, Le/h;->l:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/view/View;->getPaddingBottom()I

    move-result v14

    invoke-virtual {v7, v11, v12, v15, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v7, v1, Le/h;->l:Landroid/widget/ImageView;

    invoke-virtual {v7, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_6

    :cond_c
    invoke-virtual {v2, v11}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    iget-object v7, v1, Le/h;->l:Landroid/widget/ImageView;

    invoke-virtual {v7, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    :goto_6
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-eq v3, v10, :cond_d

    move v3, v13

    goto :goto_7

    :cond_d
    move v3, v8

    :goto_7
    if-eqz v4, :cond_e

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eq v7, v10, :cond_e

    move v7, v13

    goto :goto_8

    :cond_e
    move v7, v8

    :goto_8
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-eq v6, v10, :cond_f

    move v6, v13

    goto :goto_9

    :cond_f
    move v6, v8

    :goto_9
    if-nez v6, :cond_10

    const v10, 0x7f0801c5

    invoke-virtual {v5, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    if-eqz v10, :cond_10

    invoke-virtual {v10, v8}, Landroid/view/View;->setVisibility(I)V

    :cond_10
    if-eqz v7, :cond_13

    iget-object v10, v1, Le/h;->i:Landroidx/core/widget/NestedScrollView;

    if-eqz v10, :cond_11

    invoke-virtual {v10, v13}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    :cond_11
    iget-object v10, v1, Le/h;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v10, :cond_12

    const v10, 0x7f0801d7

    invoke-virtual {v4, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    goto :goto_a

    :cond_12
    const/4 v4, 0x0

    :goto_a
    if-eqz v4, :cond_14

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    goto :goto_b

    :cond_13
    const v4, 0x7f0801c6

    invoke-virtual {v5, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_14

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    :cond_14
    :goto_b
    iget-object v4, v1, Le/h;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    instance-of v10, v4, Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v10, :cond_18

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v6, :cond_15

    if-nez v7, :cond_18

    :cond_15
    invoke-virtual {v4}, Landroid/view/View;->getPaddingLeft()I

    move-result v10

    if-eqz v7, :cond_16

    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    move-result v11

    goto :goto_c

    :cond_16
    iget v11, v4, Landroidx/appcompat/app/AlertController$RecycleListView;->b:I

    :goto_c
    invoke-virtual {v4}, Landroid/view/View;->getPaddingRight()I

    move-result v12

    if-eqz v6, :cond_17

    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    move-result v14

    goto :goto_d

    :cond_17
    iget v14, v4, Landroidx/appcompat/app/AlertController$RecycleListView;->c:I

    :goto_d
    invoke-virtual {v4, v10, v11, v12, v14}, Landroid/view/View;->setPadding(IIII)V

    :cond_18
    if-nez v3, :cond_1c

    iget-object v3, v1, Le/h;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v3, :cond_19

    goto :goto_e

    :cond_19
    iget-object v3, v1, Le/h;->i:Landroidx/core/widget/NestedScrollView;

    :goto_e
    if-eqz v3, :cond_1c

    if-eqz v6, :cond_1a

    const/4 v8, 0x2

    :cond_1a
    or-int v4, v7, v8

    const v6, 0x7f08017d

    invoke-virtual {v2, v6}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f08017c

    invoke-virtual {v2, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v2

    sget-object v7, Li0/v0;->a:Ljava/util/WeakHashMap;

    const/4 v7, 0x3

    invoke-static {v3, v4, v7}, Li0/l0;->d(Landroid/view/View;II)V

    if-eqz v6, :cond_1b

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1b
    if-eqz v2, :cond_1c

    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1c
    iget-object v2, v1, Le/h;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v2, :cond_1d

    iget-object v3, v1, Le/h;->p:Landroid/widget/ListAdapter;

    if-eqz v3, :cond_1d

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget v1, v1, Le/h;->q:I

    if-le v1, v9, :cond_1d

    invoke-virtual {v2, v1, v13}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setSelection(I)V

    :cond_1d
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Le/j;->g:Le/h;

    iget-object v0, v0, Le/h;->i:Landroidx/core/widget/NestedScrollView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Le/j;->g:Le/h;

    iget-object v0, v0, Le/h;->i:Landroidx/core/widget/NestedScrollView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic onStop()V
    .locals 0

    invoke-virtual {p0}, Le/j;->o()V

    return-void
.end method

.method public final q(I)V
    .locals 1

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/r;->j(I)V

    return-void
.end method

.method public final r(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/r;->k(Landroid/view/View;)V

    return-void
.end method

.method public final s(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le/r;->l(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final bridge synthetic setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/j;->q(I)V

    return-void
.end method

.method public final bridge synthetic setContentView(Landroid/view/View;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Le/j;->r(Landroid/view/View;)V

    return-void
.end method

.method public final bridge synthetic setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Le/j;->s(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final bridge synthetic setTitle(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/j;->u(I)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Le/j;->v(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Le/j;->g:Le/h;

    .line 3
    iput-object p1, v0, Le/h;->d:Ljava/lang/CharSequence;

    .line 4
    iget-object v0, v0, Le/h;->m:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final u(I)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/r;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final v(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Le/j;->k()Le/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/r;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final w(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
