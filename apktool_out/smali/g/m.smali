.class public final Lg/m;
.super Lc3/h;
.source "SourceFile"


# instance fields
.field public final synthetic j:I

.field public k:Z

.field public l:I

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg/n;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lg/m;->j:I

    iput-object p1, p0, Lg/m;->m:Ljava/lang/Object;

    iput-boolean v0, p0, Lg/m;->k:Z

    iput v0, p0, Lg/m;->l:I

    return-void
.end method

.method public constructor <init>(Li/x3;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lg/m;->j:I

    iput-object p1, p0, Lg/m;->m:Ljava/lang/Object;

    iput p2, p0, Lg/m;->l:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lg/m;->k:Z

    return-void
.end method


# virtual methods
.method public final C()V
    .locals 2

    iget v0, p0, Lg/m;->j:I

    iget-object v1, p0, Lg/m;->m:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Li/x3;

    iget-object v0, v1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_0
    iget-boolean v0, p0, Lg/m;->k:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lg/m;->k:Z

    check-cast v1, Lg/n;

    iget-object v0, v1, Lg/n;->d:Li0/e1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Li0/e1;->C()V

    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final a()V
    .locals 3

    iget v0, p0, Lg/m;->j:I

    iget-object v1, p0, Lg/m;->m:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lg/m;->k:Z

    if-nez v0, :cond_0

    check-cast v1, Li/x3;

    iget-object v0, v1, Li/x3;->a:Landroidx/appcompat/widget/Toolbar;

    iget v1, p0, Lg/m;->l:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void

    :pswitch_0
    iget v0, p0, Lg/m;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lg/m;->l:I

    check-cast v1, Lg/n;

    iget-object v2, v1, Lg/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v0, v2, :cond_2

    iget-object v0, v1, Lg/n;->d:Li0/e1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Li0/e1;->a()V

    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lg/m;->l:I

    iput-boolean v0, p0, Lg/m;->k:Z

    iput-boolean v0, v1, Lg/n;->e:Z

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final x(Landroid/view/View;)V
    .locals 0

    iget p1, p0, Lg/m;->j:I

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lg/m;->k:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
