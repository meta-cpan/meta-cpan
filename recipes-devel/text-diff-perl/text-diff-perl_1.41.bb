DESCRIPTION = ""diff()" provides a basic set of services akin to the GNU "diff" \
utility. It is not anywhere near as feature complete as GNU "diff", but \
it is better \
integrated with Perl and available on all platforms. It is often faster \
than \
shelling out to a system's "diff" executable for small files, and \
generally \
slower on larger files."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Text-Diff"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/O/OV/OVID/Text-Diff-1.41.tar.gz"

SRC_URI[md5sum] = "30d56e6dd5551ca16b8e16cc7299dc21"
SRC_URI[sha256sum] = "a67f50a48e313c1680cc662109ce5f913ea71454db355d0cf4db87ac89d2d2fa"

S = "${WORKDIR}/Text-Diff-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
