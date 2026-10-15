.class public final Landroidx/activity/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/c;


# instance fields
.field public final b:Landroidx/fragment/app/c0;

.field public final synthetic c:Landroidx/activity/z;


# direct methods
.method public constructor <init>(Landroidx/activity/z;Landroidx/fragment/app/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/x;->c:Landroidx/activity/z;

    iput-object p2, p0, Landroidx/activity/x;->b:Landroidx/fragment/app/c0;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 4

    iget-object v0, p0, Landroidx/activity/x;->c:Landroidx/activity/z;

    iget-object v1, v0, Landroidx/activity/z;->b:La3/i;

    iget-object v2, p0, Landroidx/activity/x;->b:Landroidx/fragment/app/c0;

    invoke-virtual {v1, v2}, La3/i;->remove(Ljava/lang/Object;)Z

    iget-object v1, v0, Landroidx/activity/z;->c:Landroidx/fragment/app/c0;

    invoke-static {v1, v2}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, v0, Landroidx/activity/z;->c:Landroidx/fragment/app/c0;

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v2, Landroidx/fragment/app/c0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v2, Landroidx/fragment/app/c0;->c:Lj3/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lj3/a;->a()Ljava/lang/Object;

    :cond_1
    iput-object v3, v2, Landroidx/fragment/app/c0;->c:Lj3/a;

    return-void
.end method
