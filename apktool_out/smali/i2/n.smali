.class public final Li2/n;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final b:Lcom/google/android/material/textfield/TextInputLayout;

.field public final c:Landroid/widget/FrameLayout;

.field public final d:Lcom/google/android/material/internal/CheckableImageButton;

.field public e:Landroid/content/res/ColorStateList;

.field public f:Landroid/graphics/PorterDuff$Mode;

.field public g:Landroid/view/View$OnLongClickListener;

.field public final h:Lcom/google/android/material/internal/CheckableImageButton;

.field public final i:Landroidx/activity/result/i;

.field public j:I

.field public final k:Ljava/util/LinkedHashSet;

.field public l:Landroid/content/res/ColorStateList;

.field public m:Landroid/graphics/PorterDuff$Mode;

.field public n:I

.field public o:Landroid/widget/ImageView$ScaleType;

.field public p:Landroid/view/View$OnLongClickListener;

.field public q:Ljava/lang/CharSequence;

.field public final r:Li/h1;

.field public s:Z

.field public t:Landroid/widget/EditText;

.field public final u:Landroid/view/accessibility/AccessibilityManager;

.field public v:Lj0/d;

.field public final w:Li2/l;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Le/c;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    iput v3, v0, Li2/n;->j:I

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v4, v0, Li2/n;->k:Ljava/util/LinkedHashSet;

    new-instance v4, Li2/l;

    invoke-direct {v4, v0}, Li2/l;-><init>(Li2/n;)V

    iput-object v4, v0, Li2/n;->w:Li2/l;

    new-instance v4, Li2/m;

    invoke-direct {v4, v0}, Li2/m;-><init>(Li2/n;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "accessibility"

    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/accessibility/AccessibilityManager;

    iput-object v5, v0, Li2/n;->u:Landroid/view/accessibility/AccessibilityManager;

    iput-object v1, v0, Li2/n;->b:Lcom/google/android/material/textfield/TextInputLayout;

    const/16 v5, 0x8

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v7, -0x2

    const/4 v8, -0x1

    const v9, 0x800005

    invoke-direct {v6, v7, v8, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v6, Landroid/widget/FrameLayout;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v6, v9}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v6, v0, Li2/n;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v9, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v9

    const v10, 0x7f0801cd

    invoke-virtual {v0, v0, v9, v10}, Li2/n;->a(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;

    move-result-object v10

    iput-object v10, v0, Li2/n;->d:Lcom/google/android/material/internal/CheckableImageButton;

    const v11, 0x7f0801cc

    invoke-virtual {v0, v6, v9, v11}, Li2/n;->a(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;

    move-result-object v9

    iput-object v9, v0, Li2/n;->h:Lcom/google/android/material/internal/CheckableImageButton;

    new-instance v11, Landroidx/activity/result/i;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    new-instance v12, Landroid/util/SparseArray;

    invoke-direct {v12}, Landroid/util/SparseArray;-><init>()V

    iput-object v12, v11, Landroidx/activity/result/i;->d:Ljava/lang/Object;

    iput-object v0, v11, Landroidx/activity/result/i;->e:Ljava/lang/Object;

    const/16 v12, 0x1c

    invoke-virtual {v2, v12, v3}, Le/c;->n(II)I

    move-result v12

    iput v12, v11, Landroidx/activity/result/i;->b:I

    const/16 v12, 0x34

    invoke-virtual {v2, v12, v3}, Le/c;->n(II)I

    move-result v12

    iput v12, v11, Landroidx/activity/result/i;->c:I

    iput-object v11, v0, Li2/n;->i:Landroidx/activity/result/i;

    new-instance v11, Li/h1;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    const/4 v13, 0x0

    invoke-direct {v11, v12, v13}, Li/h1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v11, v0, Li2/n;->r:Li/h1;

    const/16 v12, 0x26

    invoke-virtual {v2, v12}, Le/c;->r(I)Z

    move-result v14

    if-eqz v14, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-static {v14, v2, v12}, Lc3/h;->Q0(Landroid/content/Context;Le/c;I)Landroid/content/res/ColorStateList;

    move-result-object v12

    iput-object v12, v0, Li2/n;->e:Landroid/content/res/ColorStateList;

    :cond_0
    const/16 v12, 0x27

    invoke-virtual {v2, v12}, Le/c;->r(I)Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-virtual {v2, v12, v8}, Le/c;->k(II)I

    move-result v12

    invoke-static {v12, v13}, Lc3/h;->S1(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v12

    iput-object v12, v0, Li2/n;->f:Landroid/graphics/PorterDuff$Mode;

    :cond_1
    const/16 v12, 0x25

    invoke-virtual {v2, v12}, Le/c;->r(I)Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-virtual {v2, v12}, Le/c;->h(I)Landroid/graphics/drawable/Drawable;

    move-result-object v12

    invoke-virtual {v0, v12}, Li2/n;->i(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    const v14, 0x7f0f0039

    invoke-virtual {v12, v14}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v10, v12}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    sget-object v12, Li0/v0;->a:Ljava/util/WeakHashMap;

    const/4 v12, 0x2

    invoke-static {v10, v12}, Li0/e0;->s(Landroid/view/View;I)V

    invoke-virtual {v10, v3}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v10, v3}, Lcom/google/android/material/internal/CheckableImageButton;->setPressable(Z)V

    invoke-virtual {v10, v3}, Landroid/view/View;->setFocusable(Z)V

    const/16 v14, 0x35

    invoke-virtual {v2, v14}, Le/c;->r(I)Z

    move-result v15

    if-nez v15, :cond_4

    const/16 v15, 0x20

    invoke-virtual {v2, v15}, Le/c;->r(I)Z

    move-result v16

    if-eqz v16, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-static {v12, v2, v15}, Lc3/h;->Q0(Landroid/content/Context;Le/c;I)Landroid/content/res/ColorStateList;

    move-result-object v12

    iput-object v12, v0, Li2/n;->l:Landroid/content/res/ColorStateList;

    :cond_3
    const/16 v12, 0x21

    invoke-virtual {v2, v12}, Le/c;->r(I)Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-virtual {v2, v12, v8}, Le/c;->k(II)I

    move-result v12

    invoke-static {v12, v13}, Lc3/h;->S1(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v12

    iput-object v12, v0, Li2/n;->m:Landroid/graphics/PorterDuff$Mode;

    :cond_4
    const/16 v12, 0x1e

    invoke-virtual {v2, v12}, Le/c;->r(I)Z

    move-result v15

    const/4 v7, 0x1

    if-eqz v15, :cond_6

    invoke-virtual {v2, v12, v3}, Le/c;->k(II)I

    move-result v12

    invoke-virtual {v0, v12}, Li2/n;->g(I)V

    const/16 v12, 0x1b

    invoke-virtual {v2, v12}, Le/c;->r(I)Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-virtual {v2, v12}, Le/c;->q(I)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v9}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v14

    if-eq v14, v12, :cond_5

    invoke-virtual {v9, v12}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_5
    const/16 v12, 0x1a

    invoke-virtual {v2, v12, v7}, Le/c;->b(IZ)Z

    move-result v12

    invoke-virtual {v9, v12}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    goto :goto_0

    :cond_6
    invoke-virtual {v2, v14}, Le/c;->r(I)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x36

    invoke-virtual {v2, v12}, Le/c;->r(I)Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-static {v15, v2, v12}, Lc3/h;->Q0(Landroid/content/Context;Le/c;I)Landroid/content/res/ColorStateList;

    move-result-object v12

    iput-object v12, v0, Li2/n;->l:Landroid/content/res/ColorStateList;

    :cond_7
    const/16 v12, 0x37

    invoke-virtual {v2, v12}, Le/c;->r(I)Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-virtual {v2, v12, v8}, Le/c;->k(II)I

    move-result v12

    invoke-static {v12, v13}, Lc3/h;->S1(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v12

    iput-object v12, v0, Li2/n;->m:Landroid/graphics/PorterDuff$Mode;

    :cond_8
    invoke-virtual {v2, v14, v3}, Le/c;->b(IZ)Z

    move-result v12

    invoke-virtual {v0, v12}, Li2/n;->g(I)V

    const/16 v12, 0x33

    invoke-virtual {v2, v12}, Le/c;->q(I)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v9}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v14

    if-eq v14, v12, :cond_9

    invoke-virtual {v9, v12}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_9
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    const v14, 0x7f0602be

    invoke-virtual {v12, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v12

    const/16 v14, 0x1d

    invoke-virtual {v2, v14, v12}, Le/c;->e(II)I

    move-result v12

    if-ltz v12, :cond_f

    iget v14, v0, Li2/n;->n:I

    if-eq v12, v14, :cond_a

    iput v12, v0, Li2/n;->n:I

    invoke-virtual {v9, v12}, Landroid/view/View;->setMinimumWidth(I)V

    invoke-virtual {v9, v12}, Landroid/view/View;->setMinimumHeight(I)V

    invoke-virtual {v10, v12}, Landroid/view/View;->setMinimumWidth(I)V

    invoke-virtual {v10, v12}, Landroid/view/View;->setMinimumHeight(I)V

    :cond_a
    const/16 v12, 0x1f

    invoke-virtual {v2, v12}, Le/c;->r(I)Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-virtual {v2, v12, v8}, Le/c;->k(II)I

    move-result v8

    invoke-static {v8}, Lc3/h;->s0(I)Landroid/widget/ImageView$ScaleType;

    move-result-object v8

    iput-object v8, v0, Li2/n;->o:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v9, v8}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v10, v8}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_b
    invoke-virtual {v11, v5}, Landroid/view/View;->setVisibility(I)V

    const v5, 0x7f0801d4

    invoke-virtual {v11, v5}, Landroid/view/View;->setId(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v8, 0x42a00000    # 80.0f

    const/4 v12, -0x2

    invoke-direct {v5, v12, v12, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v11, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v11, v7}, Li0/h0;->f(Landroid/view/View;I)V

    const/16 v5, 0x48

    invoke-virtual {v2, v5, v3}, Le/c;->n(II)I

    move-result v3

    invoke-virtual {v11, v3}, Landroid/widget/TextView;->setTextAppearance(I)V

    const/16 v3, 0x49

    invoke-virtual {v2, v3}, Le/c;->r(I)Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-virtual {v2, v3}, Le/c;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v11, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_c
    const/16 v3, 0x47

    invoke-virtual {v2, v3}, Le/c;->q(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_1

    :cond_d
    move-object v13, v2

    :goto_1
    iput-object v13, v0, Li2/n;->q:Ljava/lang/CharSequence;

    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual/range {p0 .. p0}, Li2/n;->n()V

    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v2, v1, Lcom/google/android/material/textfield/TextInputLayout;->f0:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    iget-object v2, v1, Lcom/google/android/material/textfield/TextInputLayout;->e:Landroid/widget/EditText;

    if-eqz v2, :cond_e

    invoke-virtual {v4, v1}, Li2/m;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    :cond_e
    new-instance v1, Lh/f;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v0}, Lh/f;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void

    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "endIconSize cannot be less than 0"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;
    .locals 2

    const v0, 0x7f0b002d

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1, p3}, Landroid/view/View;->setId(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lc3/h;->p1(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-static {p2, v1}, Li0/m;->h(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    :cond_0
    return-object p1
.end method

.method public final b()Li2/o;
    .locals 5

    iget v0, p0, Li2/n;->j:I

    iget-object v1, p0, Li2/n;->i:Landroidx/activity/result/i;

    iget-object v2, v1, Landroidx/activity/result/i;->d:Ljava/lang/Object;

    check-cast v2, Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/o;

    if-nez v3, :cond_5

    const/4 v3, -0x1

    if-eq v0, v3, :cond_4

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x3

    if-ne v0, v3, :cond_0

    new-instance v3, Li2/k;

    iget-object v1, v1, Landroidx/activity/result/i;->e:Ljava/lang/Object;

    check-cast v1, Li2/n;

    invoke-direct {v3, v1}, Li2/k;-><init>(Li2/n;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid end icon mode: "

    invoke-static {v2, v0}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v3, Li2/d;

    iget-object v1, v1, Landroidx/activity/result/i;->e:Ljava/lang/Object;

    check-cast v1, Li2/n;

    invoke-direct {v3, v1}, Li2/d;-><init>(Li2/n;)V

    goto :goto_0

    :cond_2
    new-instance v3, Li2/u;

    iget-object v4, v1, Landroidx/activity/result/i;->e:Ljava/lang/Object;

    check-cast v4, Li2/n;

    iget v1, v1, Landroidx/activity/result/i;->c:I

    invoke-direct {v3, v4, v1}, Li2/u;-><init>(Li2/n;I)V

    goto :goto_0

    :cond_3
    new-instance v4, Li2/e;

    iget-object v1, v1, Landroidx/activity/result/i;->e:Ljava/lang/Object;

    check-cast v1, Li2/n;

    invoke-direct {v4, v1, v3}, Li2/e;-><init>(Li2/n;I)V

    move-object v3, v4

    goto :goto_0

    :cond_4
    new-instance v3, Li2/e;

    iget-object v1, v1, Landroidx/activity/result/i;->e:Ljava/lang/Object;

    check-cast v1, Li2/n;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Li2/e;-><init>(Li2/n;I)V

    :goto_0
    invoke-virtual {v2, v0, v3}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_5
    return-object v3
.end method

.method public final c()I
    .locals 3

    invoke-virtual {p0}, Li2/n;->d()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Li2/n;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Li2/n;->h:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-static {v0}, Li0/m;->c(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v0

    add-int/2addr v0, v1

    :goto_1
    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, Li0/f0;->e(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Li2/n;->r:Li/h1;

    invoke-static {v2}, Li0/f0;->e(Landroid/view/View;)I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    return v2
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Li2/n;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Li2/n;->h:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Li2/n;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final f(Z)V
    .locals 5

    invoke-virtual {p0}, Li2/n;->b()Li2/o;

    move-result-object v0

    invoke-virtual {v0}, Li2/o;->k()Z

    move-result v1

    iget-object v2, p0, Li2/n;->h:Lcom/google/android/material/internal/CheckableImageButton;

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    move-result v1

    invoke-virtual {v0}, Li2/o;->l()Z

    move-result v4

    if-eq v1, v4, :cond_0

    xor-int/2addr v1, v3

    invoke-virtual {v2, v1}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    instance-of v4, v0, Li2/k;

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->isActivated()Z

    move-result v4

    invoke-virtual {v0}, Li2/o;->j()Z

    move-result v0

    if-eq v4, v0, :cond_1

    xor-int/lit8 v0, v4, 0x1

    invoke-virtual {v2, v0}, Landroid/view/View;->setActivated(Z)V

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    if-nez p1, :cond_2

    if-eqz v3, :cond_3

    :cond_2
    iget-object p1, p0, Li2/n;->l:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Li2/n;->b:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v0, v2, p1}, Lc3/h;->g2(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    :cond_3
    return-void
.end method

.method public final g(I)V
    .locals 8

    iget v0, p0, Li2/n;->j:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Li2/n;->b()Li2/o;

    move-result-object v0

    iget-object v1, p0, Li2/n;->v:Lj0/d;

    iget-object v2, p0, Li2/n;->u:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-static {v2, v1}, Lj0/c;->b(Landroid/view/accessibility/AccessibilityManager;Lj0/d;)Z

    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Li2/n;->v:Lj0/d;

    invoke-virtual {v0}, Li2/o;->s()V

    iput p1, p0, Li2/n;->j:I

    iget-object v0, p0, Li2/n;->k:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_b

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    move v3, v0

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0, v3}, Li2/n;->h(Z)V

    invoke-virtual {p0}, Li2/n;->b()Li2/o;

    move-result-object v3

    iget-object v4, p0, Li2/n;->i:Landroidx/activity/result/i;

    iget v4, v4, Landroidx/activity/result/i;->b:I

    if-nez v4, :cond_3

    invoke-virtual {v3}, Li2/o;->d()I

    move-result v4

    :cond_3
    if-eqz v4, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v4}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_1

    :cond_4
    move-object v4, v1

    :goto_1
    iget-object v5, p0, Li2/n;->h:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v5, v4}, Li/c0;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v6, p0, Li2/n;->b:Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v4, :cond_5

    iget-object v4, p0, Li2/n;->l:Landroid/content/res/ColorStateList;

    iget-object v7, p0, Li2/n;->m:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v6, v5, v4, v7}, Lc3/h;->H(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    iget-object v4, p0, Li2/n;->l:Landroid/content/res/ColorStateList;

    invoke-static {v6, v5, v4}, Lc3/h;->g2(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    :cond_5
    invoke-virtual {v3}, Li2/o;->c()I

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    :cond_6
    invoke-virtual {v5}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v4

    if-eq v4, v1, :cond_7

    invoke-virtual {v5, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_7
    invoke-virtual {v3}, Li2/o;->k()Z

    move-result v1

    invoke-virtual {v5, v1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    move-result v1

    invoke-virtual {v3, v1}, Li2/o;->i(I)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v3}, Li2/o;->r()V

    invoke-virtual {v3}, Li2/o;->h()Lj0/d;

    move-result-object p1

    iput-object p1, p0, Li2/n;->v:Lj0/d;

    if-eqz p1, :cond_8

    if-eqz v2, :cond_8

    sget-object p1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, Li0/h0;->b(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Li2/n;->v:Lj0/d;

    invoke-static {v2, p1}, Lj0/c;->a(Landroid/view/accessibility/AccessibilityManager;Lj0/d;)Z

    :cond_8
    invoke-virtual {v3}, Li2/o;->f()Landroid/view/View$OnClickListener;

    move-result-object p1

    iget-object v1, p0, Li2/n;->p:Landroid/view/View$OnLongClickListener;

    invoke-virtual {v5, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v5, v1}, Lc3/h;->r2(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    iget-object p1, p0, Li2/n;->t:Landroid/widget/EditText;

    if-eqz p1, :cond_9

    invoke-virtual {v3, p1}, Li2/o;->m(Landroid/widget/EditText;)V

    invoke-virtual {p0, v3}, Li2/n;->j(Li2/o;)V

    :cond_9
    iget-object p1, p0, Li2/n;->l:Landroid/content/res/ColorStateList;

    iget-object v1, p0, Li2/n;->m:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v6, v5, p1, v1}, Lc3/h;->H(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0, v0}, Li2/n;->f(Z)V

    return-void

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The current box background mode "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is not supported by the end icon mode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La;->n(Ljava/lang/Object;)V

    throw v1
.end method

.method public final h(Z)V
    .locals 1

    invoke-virtual {p0}, Li2/n;->d()Z

    move-result v0

    if-eq v0, p1, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    iget-object v0, p0, Li2/n;->h:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Li2/n;->k()V

    invoke-virtual {p0}, Li2/n;->m()V

    iget-object p1, p0, Li2/n;->b:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->q()Z

    :cond_1
    return-void
.end method

.method public final i(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    iget-object v0, p0, Li2/n;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Li/c0;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Li2/n;->l()V

    iget-object p1, p0, Li2/n;->e:Landroid/content/res/ColorStateList;

    iget-object v1, p0, Li2/n;->f:Landroid/graphics/PorterDuff$Mode;

    iget-object v2, p0, Li2/n;->b:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v2, v0, p1, v1}, Lc3/h;->H(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public final j(Li2/o;)V
    .locals 2

    iget-object v0, p0, Li2/n;->t:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Li2/o;->e()Landroid/view/View$OnFocusChangeListener;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li2/n;->t:Landroid/widget/EditText;

    invoke-virtual {p1}, Li2/o;->e()Landroid/view/View$OnFocusChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    :cond_1
    invoke-virtual {p1}, Li2/o;->g()Landroid/view/View$OnFocusChangeListener;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Li2/n;->h:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Li2/o;->g()Landroid/view/View$OnFocusChangeListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    :cond_2
    return-void
.end method

.method public final k()V
    .locals 4

    iget-object v0, p0, Li2/n;->h:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Li2/n;->e()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p0, Li2/n;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Li2/n;->q:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Li2/n;->s:Z

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    invoke-virtual {p0}, Li2/n;->d()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p0}, Li2/n;->e()Z

    move-result v3

    if-nez v3, :cond_2

    if-nez v0, :cond_3

    :cond_2
    move v1, v2

    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final l()V
    .locals 3

    iget-object v0, p0, Li2/n;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Li2/n;->b:Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v1, :cond_0

    iget-object v1, v2, Lcom/google/android/material/textfield/TextInputLayout;->k:Li2/r;

    iget-boolean v1, v1, Li2/r;->q:Z

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Li2/n;->k()V

    invoke-virtual {p0}, Li2/n;->m()V

    iget v0, p0, Li2/n;->j:I

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->q()Z

    :goto_1
    return-void
.end method

.method public final m()V
    .locals 5

    iget-object v0, p0, Li2/n;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->e:Landroid/widget/EditText;

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Li2/n;->d()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Li2/n;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->e:Landroid/widget/EditText;

    sget-object v2, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v1}, Li0/f0;->e(Landroid/view/View;)I

    move-result v1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f06023c

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iget-object v3, v0, Lcom/google/android/material/textfield/TextInputLayout;->e:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    sget-object v4, Li0/v0;->a:Ljava/util/WeakHashMap;

    iget-object v4, p0, Li2/n;->r:Li/h1;

    invoke-static {v4, v2, v3, v1, v0}, Li0/f0;->k(Landroid/view/View;IIII)V

    return-void
.end method

.method public final n()V
    .locals 4

    iget-object v0, p0, Li2/n;->r:Li/h1;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    iget-object v2, p0, Li2/n;->q:Ljava/lang/CharSequence;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Li2/n;->s:Z

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    if-eq v1, v2, :cond_2

    invoke-virtual {p0}, Li2/n;->b()Li2/o;

    move-result-object v1

    if-nez v2, :cond_1

    const/4 v3, 0x1

    :cond_1
    invoke-virtual {v1, v3}, Li2/o;->p(Z)V

    :cond_2
    invoke-virtual {p0}, Li2/n;->k()V

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Li2/n;->b:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->q()Z

    return-void
.end method
