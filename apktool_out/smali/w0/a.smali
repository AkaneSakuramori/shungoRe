.class public final synthetic Lw0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/io/Serializable;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lw0/a;->b:I

    iput-object p1, p0, Lw0/a;->e:Ljava/lang/Object;

    iput p2, p0, Lw0/a;->c:I

    iput-object p3, p0, Lw0/a;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lw0/a;->b:I

    iget-object v1, p0, Lw0/a;->d:Ljava/lang/Object;

    iget v2, p0, Lw0/a;->c:I

    iget-object v3, p0, Lw0/a;->e:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lw0/d;

    invoke-interface {v3, v2, v1}, Lw0/d;->t(ILjava/lang/Object;)V

    return-void

    :pswitch_0
    check-cast v3, Lw0/b;

    iget-object v0, v3, Lw0/b;->b:Lw0/d;

    invoke-interface {v0, v2, v1}, Lw0/d;->t(ILjava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
