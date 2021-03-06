/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyStates;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyState;
import com.microsoft.azure.management.policyinsights.v2019_10_01.SummarizeResults;
import com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyStatesResource;

class PolicyStatesImpl extends WrapperImpl<PolicyStatesInner> implements PolicyStates {
    private final PolicyInsightsManager manager;

    PolicyStatesImpl(PolicyInsightsManager manager) {
        super(manager.inner().policyStates());
        this.manager = manager;
    }

    public PolicyInsightsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PolicyState> listQueryResultsForManagementGroupAsync(final PolicyStatesResource policyStatesResource, final String managementGroupName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForManagementGroupAsync(policyStatesResource, managementGroupName)
        .flatMapIterable(new Func1<Page<PolicyStateInner>, Iterable<PolicyStateInner>>() {
            @Override
            public Iterable<PolicyStateInner> call(Page<PolicyStateInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyStateInner, PolicyState>() {
            @Override
            public PolicyState call(PolicyStateInner inner) {
                return new PolicyStateImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForManagementGroupAsync(String managementGroupName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForManagementGroupAsync(managementGroupName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyState> listQueryResultsForSubscriptionAsync(final PolicyStatesResource policyStatesResource, final String subscriptionId) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForSubscriptionAsync(policyStatesResource, subscriptionId)
        .flatMapIterable(new Func1<Page<PolicyStateInner>, Iterable<PolicyStateInner>>() {
            @Override
            public Iterable<PolicyStateInner> call(Page<PolicyStateInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyStateInner, PolicyState>() {
            @Override
            public PolicyState call(PolicyStateInner inner) {
                return new PolicyStateImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForSubscriptionAsync(String subscriptionId) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForSubscriptionAsync(subscriptionId)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyState> listQueryResultsForResourceGroupAsync(final PolicyStatesResource policyStatesResource, final String subscriptionId, final String resourceGroupName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForResourceGroupAsync(policyStatesResource, subscriptionId, resourceGroupName)
        .flatMapIterable(new Func1<Page<PolicyStateInner>, Iterable<PolicyStateInner>>() {
            @Override
            public Iterable<PolicyStateInner> call(Page<PolicyStateInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyStateInner, PolicyState>() {
            @Override
            public PolicyState call(PolicyStateInner inner) {
                return new PolicyStateImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForResourceGroupAsync(String subscriptionId, String resourceGroupName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForResourceGroupAsync(subscriptionId, resourceGroupName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyState> listQueryResultsForResourceAsync(final PolicyStatesResource policyStatesResource, final String resourceId) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForResourceAsync(policyStatesResource, resourceId)
        .flatMapIterable(new Func1<Page<PolicyStateInner>, Iterable<PolicyStateInner>>() {
            @Override
            public Iterable<PolicyStateInner> call(Page<PolicyStateInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyStateInner, PolicyState>() {
            @Override
            public PolicyState call(PolicyStateInner inner) {
                return new PolicyStateImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForResourceAsync(String resourceId) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForResourceAsync(resourceId)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable triggerSubscriptionEvaluationAsync(String subscriptionId) {
        PolicyStatesInner client = this.inner();
        return client.triggerSubscriptionEvaluationAsync(subscriptionId).toCompletable();
    }

    @Override
    public Completable triggerResourceGroupEvaluationAsync(String subscriptionId, String resourceGroupName) {
        PolicyStatesInner client = this.inner();
        return client.triggerResourceGroupEvaluationAsync(subscriptionId, resourceGroupName).toCompletable();
    }

    @Override
    public Observable<PolicyState> listQueryResultsForPolicySetDefinitionAsync(final PolicyStatesResource policyStatesResource, final String subscriptionId, final String policySetDefinitionName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForPolicySetDefinitionAsync(policyStatesResource, subscriptionId, policySetDefinitionName)
        .flatMapIterable(new Func1<Page<PolicyStateInner>, Iterable<PolicyStateInner>>() {
            @Override
            public Iterable<PolicyStateInner> call(Page<PolicyStateInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyStateInner, PolicyState>() {
            @Override
            public PolicyState call(PolicyStateInner inner) {
                return new PolicyStateImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForPolicySetDefinitionAsync(String subscriptionId, String policySetDefinitionName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForPolicySetDefinitionAsync(subscriptionId, policySetDefinitionName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyState> listQueryResultsForPolicyDefinitionAsync(final PolicyStatesResource policyStatesResource, final String subscriptionId, final String policyDefinitionName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForPolicyDefinitionAsync(policyStatesResource, subscriptionId, policyDefinitionName)
        .flatMapIterable(new Func1<Page<PolicyStateInner>, Iterable<PolicyStateInner>>() {
            @Override
            public Iterable<PolicyStateInner> call(Page<PolicyStateInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyStateInner, PolicyState>() {
            @Override
            public PolicyState call(PolicyStateInner inner) {
                return new PolicyStateImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForPolicyDefinitionAsync(String subscriptionId, String policyDefinitionName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForPolicyDefinitionAsync(subscriptionId, policyDefinitionName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyState> listQueryResultsForSubscriptionLevelPolicyAssignmentAsync(final PolicyStatesResource policyStatesResource, final String subscriptionId, final String policyAssignmentName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForSubscriptionLevelPolicyAssignmentAsync(policyStatesResource, subscriptionId, policyAssignmentName)
        .flatMapIterable(new Func1<Page<PolicyStateInner>, Iterable<PolicyStateInner>>() {
            @Override
            public Iterable<PolicyStateInner> call(Page<PolicyStateInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyStateInner, PolicyState>() {
            @Override
            public PolicyState call(PolicyStateInner inner) {
                return new PolicyStateImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForSubscriptionLevelPolicyAssignmentAsync(String subscriptionId, String policyAssignmentName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForSubscriptionLevelPolicyAssignmentAsync(subscriptionId, policyAssignmentName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyState> listQueryResultsForResourceGroupLevelPolicyAssignmentAsync(final PolicyStatesResource policyStatesResource, final String subscriptionId, final String resourceGroupName, final String policyAssignmentName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForResourceGroupLevelPolicyAssignmentAsync(policyStatesResource, subscriptionId, resourceGroupName, policyAssignmentName)
        .flatMapIterable(new Func1<Page<PolicyStateInner>, Iterable<PolicyStateInner>>() {
            @Override
            public Iterable<PolicyStateInner> call(Page<PolicyStateInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyStateInner, PolicyState>() {
            @Override
            public PolicyState call(PolicyStateInner inner) {
                return new PolicyStateImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForResourceGroupLevelPolicyAssignmentAsync(String subscriptionId, String resourceGroupName, String policyAssignmentName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForResourceGroupLevelPolicyAssignmentAsync(subscriptionId, resourceGroupName, policyAssignmentName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

}
