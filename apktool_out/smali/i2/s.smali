.class public final Li2/s;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# instance fields
.field public b:Landroid/content/res/ColorStateList;

.field public c:Landroid/content/res/ColorStateList;

.field public final synthetic d:Li2/t;


# direct methods
.method public constructor <init>(Li2/t;Landroid/content/Context;I[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Li2/s;->d:Li2/t;

    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    invoke-virtual {p0}, Li2/s;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    iget-object v0, p0, Li2/s;->d:Li2/t;

    iget-object v1, v0, Li2/t;->m:Landroid/content/res/ColorStateList;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    const/4 v5, 0x2

    const/4 v6, 0x0

    if-nez v4, :cond_1

    move-object v4, v6

    goto :goto_1

    :cond_1
    const v4, 0x10100a7

    filled-new-array {v4}, [I

    move-result-object v4

    invoke-virtual {v1, v4, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    filled-new-array {v1, v2}, [I

    move-result-object v1

    new-array v7, v5, [[I

    aput-object v4, v7, v2

    new-array v4, v2, [I

    aput-object v4, v7, v3

    new-instance v4, Landroid/content/res/ColorStateList;

    invoke-direct {v4, v7, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    :goto_1
    iput-object v4, p0, Li2/s;->c:Landroid/content/res/ColorStateList;

    iget v1, v0, Li2/t;->l:I

    if-eqz v1, :cond_2

    iget-object v1, v0, Li2/t;->m:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_2

    const v1, 0x1010367

    const v4, -0x10100a7

    filled-new-array {v1, v4}, [I

    move-result-object v1

    const v6, 0x10100a1

    filled-new-array {v6, v4}, [I

    move-result-object v4

    iget-object v6, v0, Li2/t;->m:Landroid/content/res/ColorStateList;

    invoke-virtual {v6, v4, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v6

    iget-object v7, v0, Li2/t;->m:Landroid/content/res/ColorStateList;

    invoke-virtual {v7, v1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v7

    iget v8, v0, Li2/t;->l:I

    invoke-static {v6, v8}, Lb0/a;->b(II)I

    move-result v6

    iget v8, v0, Li2/t;->l:I

    invoke-static {v7, v8}, Lb0/a;->b(II)I

    move-result v7

    iget v0, v0, Li2/t;->l:I

    filled-new-array {v6, v7, v0}, [I

    move-result-object v0

    const/4 v6, 0x3

    new-array v6, v6, [[I

    aput-object v4, v6, v2

    aput-object v1, v6, v3

    new-array v1, v2, [I

    aput-object v1, v6, v5

    new-instance v1, Landroid/content/res/ColorStateList;

    invoke-direct {v1, v6, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    move-object v6, v1

    :cond_2
    iput-object v6, p0, Li2/s;->b:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    instance-of p2, p1, Landroid/widget/TextView;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Landroid/widget/TextView;

    iget-object p3, p0, Li2/s;->d:Li2/t;

    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, p3, Li2/t;->l:I

    if-eqz v0, :cond_1

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    iget p3, p3, Li2/t;->l:I

    invoke-direct {v0, p3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iget-object p3, p0, Li2/s;->c:Landroid/content/res/ColorStateList;

    if-eqz p3, :cond_0

    iget-object p3, p0, Li2/s;->b:Landroid/content/res/ColorStateList;

    invoke-static {v0, p3}, Lc0/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    new-instance p3, Landroid/graphics/drawable/RippleDrawable;

    iget-object v2, p0, Li2/s;->c:Landroid/content/res/ColorStateList;

    invoke-direct {p3, v2, v0, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    move-object v1, p3

    goto :goto_0

    :cond_0
    move-object v1, v0

    :cond_1
    :goto_0
    sget-object p3, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p2, v1}, Li0/e0;->q(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    :cond_2
    return-object p1
.end method
