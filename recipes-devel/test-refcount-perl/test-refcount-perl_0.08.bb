DESCRIPTION = "The Perl garbage collector uses simple reference counting during the \
normal execution of a program. This means that cycles or unweakened \
references in \
other parts of code can keep an object around for longer than intended. \
To \
help avoid this problem, the reference count of a new object from its \
class \
constructor ought to be 1. This way, the caller can know the object \
will be \
properly DESTROYed when it drops all of its references to it."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Refcount"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PE/PEVANS/Test-Refcount-0.08.tar.gz"

SRC_URI[md5sum] = "bcf11e5f0103568674bcc15d2168932e"
SRC_URI[sha256sum] = "90adbb5c8676953575d95e867b7aae763120de146268b7f4c00543e2c748cad7"
RRECOMMENDS_${PN} += "devel-mat-perl"

S = "${WORKDIR}/Test-Refcount-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
