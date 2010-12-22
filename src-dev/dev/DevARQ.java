package dev ;

public class DevARQ
{
    // >>>> Tasks
    
    // Algebra.asUnionQuery .. to access the functionality
    // 
    
    // string operatons: details and tests.
    // TestNodeFunctions / TestXSDFuncOp
    //   E_StrUCase, E_StrConcat, E_StrSubstring
    // tests for strings. strlen, substr, strucase, strlcase, contains, concat  
    
    // Path evaluation as per spec.
    
    // check/sort out setResultVars.
    // Enable group checking in SyntaxVarScope (causes test failures - fix tests).

    // ?? bNode label checks (UPDATE: can't use same bNode label in template and pattern for DELETE/INSERT.)

    // Pull up TransformDynamicDataset, TransformGraphRename from TDB.
    
    
    // Better access to union query??? 
    // By transform, query context.
    //  Version for tru=iples evaluation (TransformUnionQuery) and quads evaluation (A2 from TDB)
    // Document - move from TDB

    // <<<< Tasks

    // QueryParseException for updates is confusing.
    //   All QueryException  -> SparqlException or LanguageParseException
    
    // dayTimeDuration
    
    // Prologure from RIOT
    // PrefixMap from RIOT
    
    // XSDFuncOp.getDT*
    
    // Migrations/enable:
    //   TransformUnionQuery
    //   TransformDynamicDataset
    //   TransformGraphRename
    //   TransformPropertyPathFlatten
    
    // ---- Documentation
    // Legacy StageGenerator (http://openjena.org/ARQ/arq-query-eval.html)
    // src-examples of OpExecutor+QueryEngine
    // http://www.openjena.org/wiki/ARQ/Concurrency
    // add qparse,uparse to wiki/ARQ/
    // Documentation for CSV etc.
    // Supported types

    // DatasetGraph : connections
    
    // Event type -> list of parts vs regex filtering (?)
    // Base 64, MD5, SHA :: Apache commons codec.

    // ---- SPARQL 1.1
    // Update: can't use same bNode label in template and pattern for DELETE/INSERT.
    // BINDINGS execution
    // Aggregates to return iterators.
    
    // Property path rewrites as per spec (i.e. earlier than evaluation)
    //   Path tests: WorkSpace/PropertyPathTests/
    //   Transform: paths for new operators. e.g. {2}
    //   {N,} to be {N} UNION {0,N}

    // ---- Pipeline:
    // Architecture: 
    // Canonicalization: Fix URIs. () [] SPC
    // Number canonicalization.
    // Canonicalized lang tags?
    //   owl:equivalentClass, owl:equivalentProperty,
    //   owl:inverseOf, owl:SymmetricProperty, owl:TransitiveProperty
    //   rdfs:subClassOf (aux table).
    //   rdfs:subPropertyOf (aux table).

    // ---- Events.
    //  Hierarchy.

    // Query abort - from a separate thread - set flag in iterator and check on every .hasNext call.  
    
    // ---- RIOT
    // closing InputStream
    // Bad character encoding - exception but line/col = 1/1
    // Filename in messages.
    // Errors after file name! Print file name once if error.
    // Recovery parsing - scan to DOT?
    
    // ---- Union Transform
    // Tests for unionTransformation
    // TestUnionTransformTriples
    // TestUnionTransformQuads
    // TestUnionGraph
    // ** Enable in TS_Algebra.
    
    // XSDDuration

    // ---- Commands
    // --data to accept TriG and N-Quads
    
    // Result set isomorphism - need backtracking
    
    // Syntax for lists: LIST(?list, ?index, ?member)

    // ---- Core
    // Memory DatasetGraph to support Quad.unionGraph, defaultGraph and

    // ---- Expr
    // Scalar and column expressions

    // ---- Union transformation
    // Transform rewrites BGP to (graph ?_ bgp)
    // Transform rewrites QuadBlock to (graph ?_ bgp)
    // Implicit default graph and named union.
    // Next:
    // ** (graph <unionGraph> BGP) rewrites the BGP but leaves the (graph
    // <union> ...) wrapper.
    // ==> (graph <unionGraph> (distinct (graph ?_ bgp)))
    // More runtime processing and less transformation?
    // Or just strip (graph <union> ...) on the way past.

    // ---- Build
    // Build: use maven resources for the etching of version.

    // ---- Optimization
    // 1/ Enable sameTermString optimization
    // 2/ If an equality is repeated do once only.
    // 3/ Amalgamation: BGPs, Quads, Sequences.
    // 4/ Assign squashing : assign as rename. (assign ((?x ?y)))
    // 5/ Optimise FILTER(?x=?y) assuming ?x and ?y must be bound.

    // ---- MicroAPI.
    // QueryBuilder.
    // results = query().select(vars).pattern().filter().groupBy().agg()
}
