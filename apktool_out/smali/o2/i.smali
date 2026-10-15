.class public final Lo2/i;
.super Lo2/k;
.source "SourceFile"


# instance fields
.field public final synthetic e:I


# direct methods
.method public constructor <init>(Lo2/j;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lo2/i;->e:I

    .line 1
    iget-object p1, p1, Lo2/j;->c:Lo2/m;

    invoke-direct {p0, p1}, Lo2/k;-><init>(Lo2/m;)V

    return-void
.end method

.method public constructor <init>(Lo2/j;I)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, Lo2/i;->e:I

    .line 2
    iget-object p1, p1, Lo2/j;->c:Lo2/m;

    invoke-direct {p0, p1}, Lo2/k;-><init>(Lo2/m;)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo2/i;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lo2/k;->a()Lo2/l;

    move-result-object v0

    iget-object v0, v0, Lo2/l;->f:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lo2/k;->a()Lo2/l;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
