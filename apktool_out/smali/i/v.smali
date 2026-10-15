.class public final Li/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Landroid/content/res/ColorStateList;

.field public c:Landroid/graphics/PorterDuff$Mode;

.field public d:Z

.field public e:Z

.field public f:Z

.field public final g:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Li/v;->a:I

    const/4 p2, 0x0

    iput-object p2, p0, Li/v;->b:Landroid/content/res/ColorStateList;

    iput-object p2, p0, Li/v;->c:Landroid/graphics/PorterDuff$Mode;

    const/4 p2, 0x0

    iput-boolean p2, p0, Li/v;->d:Z

    iput-boolean p2, p0, Li/v;->e:Z

    iput-object p1, p0, Li/v;->g:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Li/v;->g:Landroid/widget/TextView;

    move-object v1, v0

    check-cast v1, Landroid/widget/CompoundButton;

    invoke-static {v1}, Lm0/c;->a(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-boolean v2, p0, Li/v;->d:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Li/v;->e:Z

    if-eqz v2, :cond_4

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-boolean v2, p0, Li/v;->d:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Li/v;->b:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2}, Lc0/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-boolean v2, p0, Li/v;->e:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Li/v;->c:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2}, Lc0/b;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, v0

    check-cast v2, Landroid/widget/CompoundButton;

    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3
    check-cast v0, Landroid/widget/CompoundButton;

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Li/v;->g:Landroid/widget/TextView;

    move-object v1, v0

    check-cast v1, Landroid/widget/CheckedTextView;

    invoke-virtual {v1}, Landroid/widget/CheckedTextView;->getCheckMarkDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-boolean v2, p0, Li/v;->d:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Li/v;->e:Z

    if-eqz v2, :cond_4

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-boolean v2, p0, Li/v;->d:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Li/v;->b:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2}, Lc0/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-boolean v2, p0, Li/v;->e:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Li/v;->c:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2}, Lc0/b;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, v0

    check-cast v2, Landroid/widget/CheckedTextView;

    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3
    check-cast v0, Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    return-void
.end method

.method public final c(Landroid/util/AttributeSet;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v7, p2

    iget v2, v1, Li/v;->a:I

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    iget-object v14, v1, Li/v;->g:Landroid/widget/TextView;

    packed-switch v2, :pswitch_data_0

    move-object v2, v14

    check-cast v2, Landroid/widget/CompoundButton;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget-object v4, Ld/a;->m:[I

    invoke-static {v3, v0, v4, v7}, Le/c;->u(Landroid/content/Context;Landroid/util/AttributeSet;[II)Le/c;

    move-result-object v15

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v5, v15, Le/c;->d:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Landroid/content/res/TypedArray;

    move-object/from16 v5, p1

    move/from16 v7, p2

    invoke-static/range {v2 .. v7}, Li0/v0;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    :try_start_0
    invoke-virtual {v15, v12}, Le/c;->r(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v15, v12, v13}, Le/c;->n(II)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :try_start_1
    move-object v2, v14

    check-cast v2, Landroid/widget/CompoundButton;

    move-object v3, v14

    check-cast v3, Landroid/widget/CompoundButton;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    :cond_0
    :try_start_2
    invoke-virtual {v15, v13}, Le/c;->r(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v15, v13, v13}, Le/c;->n(II)I

    move-result v0

    if-eqz v0, :cond_1

    move-object v2, v14

    check-cast v2, Landroid/widget/CompoundButton;

    move-object v3, v14

    check-cast v3, Landroid/widget/CompoundButton;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    :goto_0
    invoke-virtual {v15, v11}, Le/c;->r(I)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, v14

    check-cast v0, Landroid/widget/CompoundButton;

    invoke-virtual {v15, v11}, Le/c;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-static {v0, v2}, Lm0/b;->c(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    :cond_2
    invoke-virtual {v15, v10}, Le/c;->r(I)Z

    move-result v0

    if-eqz v0, :cond_3

    check-cast v14, Landroid/widget/CompoundButton;

    invoke-virtual {v15, v10, v9}, Le/c;->k(II)I

    move-result v0

    invoke-static {v0, v8}, Li/t1;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    invoke-static {v14, v0}, Lm0/b;->d(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    invoke-virtual {v15}, Le/c;->v()V

    return-void

    :goto_1
    invoke-virtual {v15}, Le/c;->v()V

    throw v0

    :pswitch_0
    move-object v2, v14

    check-cast v2, Landroid/widget/CheckedTextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget-object v4, Ld/a;->l:[I

    invoke-static {v3, v0, v4, v7}, Le/c;->u(Landroid/content/Context;Landroid/util/AttributeSet;[II)Le/c;

    move-result-object v15

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v5, v15, Le/c;->d:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Landroid/content/res/TypedArray;

    move-object/from16 v5, p1

    move/from16 v7, p2

    invoke-static/range {v2 .. v7}, Li0/v0;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    :try_start_3
    invoke-virtual {v15, v12}, Le/c;->r(I)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v15, v12, v13}, Le/c;->n(II)I

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_4

    :try_start_4
    move-object v2, v14

    check-cast v2, Landroid/widget/CheckedTextView;

    move-object v3, v14

    check-cast v3, Landroid/widget/CheckedTextView;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_4
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_1
    :cond_4
    :try_start_5
    invoke-virtual {v15, v13}, Le/c;->r(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v15, v13, v13}, Le/c;->n(II)I

    move-result v0

    if-eqz v0, :cond_5

    move-object v2, v14

    check-cast v2, Landroid/widget/CheckedTextView;

    move-object v3, v14

    check-cast v3, Landroid/widget/CheckedTextView;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_5
    :goto_2
    invoke-virtual {v15, v11}, Le/c;->r(I)Z

    move-result v0

    if-eqz v0, :cond_6

    move-object v0, v14

    check-cast v0, Landroid/widget/CheckedTextView;

    invoke-virtual {v15, v11}, Le/c;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/CheckedTextView;->setCheckMarkTintList(Landroid/content/res/ColorStateList;)V

    :cond_6
    invoke-virtual {v15, v10}, Le/c;->r(I)Z

    move-result v0

    if-eqz v0, :cond_7

    check-cast v14, Landroid/widget/CheckedTextView;

    invoke-virtual {v15, v10, v9}, Le/c;->k(II)I

    move-result v0

    invoke-static {v0, v8}, Li/t1;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    invoke-virtual {v14, v0}, Landroid/widget/CheckedTextView;->setCheckMarkTintMode(Landroid/graphics/PorterDuff$Mode;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_7
    invoke-virtual {v15}, Le/c;->v()V

    return-void

    :goto_3
    invoke-virtual {v15}, Le/c;->v()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
