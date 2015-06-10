DESCRIPTION = "The Crypt::RIPEMD160 module allows you to use the RIPEMD160 Message \
Digest algorithm from within Perl programs. The module is based on the \
implementation from Antoon Bosselaers from Katholieke Universiteit \
Leuven. A new RIPEMD160 context object is created with the new \
operation. Multiple simultaneous digest contexts can be maintained, if \
desired. The context is updated with the add operation which adds the \
strings contained in the *LIST* parameter. Note, however, that \
\"add('foo', 'bar')\", \"add('foo')\" followed by \"add('bar')\" and \
\"add('foobar')\" should all give the same result. The final message \
digest value is returned by the digest operation as a 20-byte binary \
string. This operation delivers the result of add operations since the \
last new or reset operation. Note that the digest operation is \
effectively a destructive, read-once operation. Once it has been \
performed, the context must be reset before being used to calculate \
another digest value. Several convenience functions are also provided. \
The addfile operation takes an open file-handle and reads it until \
end-of file in 8192 byte blocks adding the contents to the context. The \
file-handle can either be specified by name or passed as a type-glob \
reference, as shown in the examples below. The hexdigest operation \
calls digest and returns the result as a printable string of hexdecimal \
digits. This is exactly the same operation as performed by the unpack \
operation in the examples below. The hash operation can act as either a \
static member function (ie you invoke it on the RIPEMD160 class as in \
the synopsis above) or as a normal virtual function. In both cases it \
performs the complete RIPEMD160 cycle (reset, add, digest) on the \
supplied scalar value. This is convenient for handling small quantities \
of data. When invoked on the class a temporary context is created. When \
invoked through an already created context object, this context is \
used. The latter form is slightly more efficient. The hexhash operation \
is analogous to hexdigest."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Crypt-RIPEMD160"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/T/TO/TODDR/Crypt-RIPEMD160-0.06.tar.gz"

SRC_URI[md5sum] = "f37eae17af81b230104f9d0aca1b2327"
SRC_URI[sha256sum] = "ea64a1e9eb42f3d79855a392e7cca6b86e8e0bcc9aabcc5efa5fa32415b67dba"

S = "${WORKDIR}/Crypt-RIPEMD160-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
