DESCRIPTION = "Class::XSAccessor implements fast read, write and read/write accessors in \
XS. Additionally, it can provide predicates such as "has_foo()" for testing \
whether the attribute "foo" exists in the object (which is different from \
"is defined within the object"). It only works with objects that are \
implemented as ordinary hashes. Class::XSAccessor::Array implements the \
same interface for objects that use arrays for their internal \
representation."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-XSAccessor"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SM/SMUELLER/Class-XSAccessor-1.19.tar.gz"

SRC_URI[md5sum] = "5c5dea74f00ad37c5119dd22b28a5563"
SRC_URI[sha256sum] = "99c56b395f1239af19901f2feeb125d9ecb4e351a0d80daa9529211a4700a6f2"

S = "${WORKDIR}/Class-XSAccessor-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
