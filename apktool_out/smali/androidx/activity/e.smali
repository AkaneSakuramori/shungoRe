.class public final synthetic Landroidx/activity/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/a;


# instance fields
.field public final synthetic b:Landroidx/activity/n;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/e;->b:Landroidx/activity/n;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/activity/e;->b:Landroidx/activity/n;

    invoke-virtual {v0}, Landroidx/activity/n;->reportFullyDrawn()V

    const/4 v0, 0x0

    return-object v0
.end method
